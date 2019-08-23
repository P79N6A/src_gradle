package com.ss.android.ugc.aweme.shortvideo.mvtemplate;

import a.g;
import a.i;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.UIUtils;
import com.facebook.common.internal.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.e;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.shortvideo.bi;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.b;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.viewpager.MvItemFragment;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.upload.o;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class a implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68474a;

    /* renamed from: b  reason: collision with root package name */
    FragmentActivity f68475b;

    /* renamed from: c  reason: collision with root package name */
    j f68476c;

    /* renamed from: d  reason: collision with root package name */
    fh f68477d;

    /* renamed from: e  reason: collision with root package name */
    d f68478e;

    /* renamed from: f  reason: collision with root package name */
    public String f68479f;
    int g = 720;
    int h = 1280;
    int i = 1;
    c j;
    private MvTemplateView k;
    private EffectPlatform l;
    private Effect m;
    private String n;
    private String o;
    private int p;
    private String q;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean a(int i2, int i3, Intent intent) {
        boolean z;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f68474a, false, 77842, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f68474a, false, 77842, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)).booleanValue();
        } else if (i2 == 10001 && intent2 != null && i3 == -1) {
            com.ss.android.ugc.aweme.x.a aVar = (com.ss.android.ugc.aweme.x.a) intent2.getSerializableExtra("key_choose_photo_data");
            if (aVar != null) {
                ArrayList<String> arrayList = aVar.selectMediaList;
                String str = aVar.mvResZipPath;
                if (!j.a((Collection<T>) arrayList) && !TextUtils.isEmpty(str)) {
                    if (this.k != null) {
                        MvTemplateView mvTemplateView = this.k;
                        if (PatchProxy.isSupport(new Object[0], mvTemplateView, MvTemplateView.f68460a, false, 77884, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], mvTemplateView, MvTemplateView.f68460a, false, 77884, new Class[0], Void.TYPE);
                        } else {
                            MvItemFragment a2 = mvTemplateView.a(mvTemplateView.h);
                            if (a2 != null) {
                                a2.e();
                            }
                        }
                    }
                    if (PatchProxy.isSupport(new Object[]{aVar}, this, f68474a, false, 77843, new Class[]{com.ss.android.ugc.aweme.x.a.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aVar}, this, f68474a, false, 77843, new Class[]{com.ss.android.ugc.aweme.x.a.class}, Void.TYPE);
                    } else {
                        this.f68478e = d.b(this.f68475b, this.f68475b.getString(C0906R.string.c83));
                        this.f68478e.setIndeterminate(true);
                        if (this.f68476c != null) {
                            if (!(this.f68476c.i == 0 || this.f68476c.j == 0)) {
                                this.g = this.f68476c.i;
                                this.h = this.f68476c.j;
                            }
                            if ("AspectFill".equals(this.f68476c.h)) {
                                this.i = 1;
                            } else if ("AspectFit".equals(this.f68476c.h)) {
                                this.i = 3;
                            } else if ("AspectWidth".equals(this.f68476c.h)) {
                                this.i = 2;
                            }
                        }
                        if (aVar != null) {
                            aVar.srcSelectMediaList.clear();
                            aVar.srcSelectMediaList.addAll(aVar.selectMediaList);
                        }
                        i.a((Callable<TResult>) new d<TResult>(this, aVar)).a((g<TResult, TContinuationResult>) new e<TResult,TContinuationResult>(this, aVar), i.f1052b);
                    }
                }
            }
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final void a(final boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f68474a, false, 77839, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f68474a, false, 77839, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.l.a("mv", (com.ss.android.ugc.effectmanager.effect.b.g) new com.ss.android.ugc.effectmanager.effect.b.g() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f68483a;

            public final void a(com.ss.android.ugc.effectmanager.common.e.c cVar) {
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f68483a, false, 77865, new Class[]{com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f68483a, false, 77865, new Class[]{com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
                    return;
                }
                if (!z) {
                    a.this.a(a.this.f68479f);
                }
            }

            public final void a(EffectChannelResponse effectChannelResponse) {
                if (PatchProxy.isSupport(new Object[]{effectChannelResponse}, this, f68483a, false, 77864, new Class[]{EffectChannelResponse.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{effectChannelResponse}, this, f68483a, false, 77864, new Class[]{EffectChannelResponse.class}, Void.TYPE);
                    return;
                }
                a.this.a(effectChannelResponse, z, true);
            }
        });
    }

    public final boolean a(EffectChannelResponse effectChannelResponse, boolean z, boolean z2) {
        EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
        if (PatchProxy.isSupport(new Object[]{effectChannelResponse2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f68474a, false, 77840, new Class[]{EffectChannelResponse.class, Boolean.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effectChannelResponse2, Byte.valueOf(z), Byte.valueOf(z2)}, this, f68474a, false, 77840, new Class[]{EffectChannelResponse.class, Boolean.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (effectChannelResponse2 == null || j.a((Collection<T>) effectChannelResponse2.allCategoryEffects)) {
            if (!z && z2) {
                a(this.f68479f);
            }
            return false;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Effect a2 : effectChannelResponse2.allCategoryEffects) {
                j jVar = new j();
                jVar.a(a2);
                jVar.f68725c = effectChannelResponse2.urlPrefix;
                arrayList.add(jVar);
            }
            if (arrayList.size() <= 0) {
                if (!z && z2) {
                    a(this.n);
                }
                return false;
            }
            if (this.m != null && !TextUtils.isEmpty(this.m.effect_id)) {
                int i2 = -1;
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        break;
                    } else if (this.m.effect_id.equals(((j) arrayList.get(i3)).a())) {
                        i2 = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i2 >= 0) {
                    j jVar2 = (j) arrayList.remove(i2);
                    jVar2.a(this.m);
                    arrayList.add(0, jVar2);
                }
            }
            if (this.k != null) {
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c.a().a((List<j>) arrayList);
                this.k.a((List<j>) arrayList);
                if (!z) {
                    this.k.a();
                }
            }
            return true;
        }
    }

    public final void a(boolean z, int i2, Exception exc) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), exc}, this, f68474a, false, 77854, new Class[]{Boolean.TYPE, Integer.TYPE, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), exc}, this, f68474a, false, 77854, new Class[]{Boolean.TYPE, Integer.TYPE, Exception.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = null;
        if (z) {
            n.a("mv_resource_list_download_error_state", 0, (JSONObject) null);
            return;
        }
        if (exc != null) {
            jSONObject = bi.a().a("exception", k.c(exc)).a("event", o.a().b().toString()).b();
        }
        n.a("mv_resource_list_download_error_state", i2, jSONObject);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f68474a, false, 77845, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68474a, false, 77845, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null && this.k.getVisibility() == 0) {
            this.k.e();
        }
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f68474a, false, 77837, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68474a, false, 77837, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null) {
            this.k.dismiss();
        }
    }

    private com.ss.android.ugc.aweme.app.d.d e() {
        if (PatchProxy.isSupport(new Object[0], this, f68474a, false, 77850, new Class[0], com.ss.android.ugc.aweme.app.d.d.class)) {
            return (com.ss.android.ugc.aweme.app.d.d) PatchProxy.accessDispatch(new Object[0], this, f68474a, false, 77850, new Class[0], com.ss.android.ugc.aweme.app.d.d.class);
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("shoot_way", this.q).a("creation_id", this.o);
        return a2.a("draft_id", this.p);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f68474a, false, 77852, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68474a, false, 77852, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null) {
            MvTemplateView mvTemplateView = this.k;
            if (PatchProxy.isSupport(new Object[0], mvTemplateView, MvTemplateView.f68460a, false, 77886, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], mvTemplateView, MvTemplateView.f68460a, false, 77886, new Class[0], Void.TYPE);
            } else if (mvTemplateView.l != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) mvTemplateView.l.getLayoutParams();
                layoutParams.topMargin = (int) (((float) fc.c(mvTemplateView.getContext())) + UIUtils.dip2Px(mvTemplateView.getContext(), 24.5f));
                mvTemplateView.l.setLayoutParams(layoutParams);
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f68474a, false, 77836, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68474a, false, 77836, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null) {
            MvTemplateView mvTemplateView = this.k;
            if (PatchProxy.isSupport(new Object[0], mvTemplateView, MvTemplateView.f68460a, false, 77870, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], mvTemplateView, MvTemplateView.f68460a, false, 77870, new Class[0], Void.TYPE);
            } else {
                mvTemplateView.setVisibility(0);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mvTemplateView.f68464e, "alpha", new float[]{0.0f, 1.0f});
                ofFloat.setDuration(300);
                ofFloat.start();
                mvTemplateView.e();
            }
            if (this.k.getDataCount() == 0) {
                MvTemplateView mvTemplateView2 = this.k;
                if (PatchProxy.isSupport(new Object[0], mvTemplateView2, MvTemplateView.f68460a, false, 77872, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], mvTemplateView2, MvTemplateView.f68460a, false, 77872, new Class[0], Void.TYPE);
                } else {
                    mvTemplateView2.j.setVisibility(0);
                    mvTemplateView2.i.setVisibility(4);
                    mvTemplateView2.d();
                }
                c(false);
            } else if (this.k.k) {
                c(false);
            } else {
                this.k.a();
            }
        }
        r.a("enter_mv_shoot_page", (Map) e().a("content_source", "upload").a("content_type", "mv").a("enter_method", b.f68505b).f34114b);
        b.d("change_mode");
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f68474a, false, 77846, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68474a, false, 77846, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null) {
            MvTemplateView mvTemplateView = this.k;
            if (PatchProxy.isSupport(new Object[0], mvTemplateView, MvTemplateView.f68460a, false, 77883, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], mvTemplateView, MvTemplateView.f68460a, false, 77883, new Class[0], Void.TYPE);
                return;
            }
            MvItemFragment a2 = mvTemplateView.a(mvTemplateView.h);
            if (a2 != null) {
                if (PatchProxy.isSupport(new Object[0], a2, MvItemFragment.f68755a, false, 78141, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], a2, MvItemFragment.f68755a, false, 78141, new Class[0], Void.TYPE);
                } else if (a2.f68760f != null && a2.f68760f.c()) {
                    a2.f68760f.T();
                }
            }
        }
    }

    public final void a(fh fhVar) {
        this.f68477d = fhVar;
        if (this.f68477d != null) {
            this.o = this.f68477d.q;
            this.q = this.f68477d.r;
            this.p = this.f68477d.v;
        }
    }

    public final void a(j jVar) {
        j jVar2 = jVar;
        if (PatchProxy.isSupport(new Object[]{jVar2}, this, f68474a, false, 77849, new Class[]{j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar2}, this, f68474a, false, 77849, new Class[]{j.class}, Void.TYPE);
            return;
        }
        a("mv_show", jVar2);
    }

    private String b(Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, this, f68474a, false, 77856, new Class[]{Effect.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{effect}, this, f68474a, false, 77856, new Class[]{Effect.class}, String.class);
        } else if (effect == null) {
            return null;
        } else {
            List<String> tags = effect.getTags();
            if (Lists.isEmpty(tags)) {
                return null;
            }
            for (String next : tags) {
                if (next.startsWith("challenge:")) {
                    return next.substring(10);
                }
            }
            return null;
        }
    }

    private void c(final boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f68474a, false, 77838, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f68474a, false, 77838, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f68475b != null && !this.f68475b.isFinishing()) {
            if (!NetworkUtils.isNetworkAvailable(this.f68475b)) {
                if (!z) {
                    a(this.f68479f);
                }
                return;
            }
            if (this.l == null) {
                this.l = new EffectPlatform(this.f68475b, com.ss.android.ugc.aweme.port.in.a.h.c(), com.ss.android.ugc.aweme.port.in.a.D.getOKHttpClient());
            }
            this.l.a("mv", false, (com.ss.android.ugc.effectmanager.effect.b.g) new com.ss.android.ugc.effectmanager.effect.b.g() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f68480a;

                public final void a(com.ss.android.ugc.effectmanager.common.e.c cVar) {
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f68480a, false, 77863, new Class[]{com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f68480a, false, 77863, new Class[]{com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
                        return;
                    }
                    a.this.a(z);
                    if (cVar == null) {
                        a.this.a(false, 0, (Exception) null);
                    } else {
                        a.this.a(false, cVar.f77315a, cVar.f77317c);
                    }
                }

                public final void a(EffectChannelResponse effectChannelResponse) {
                    if (PatchProxy.isSupport(new Object[]{effectChannelResponse}, this, f68480a, false, 77862, new Class[]{EffectChannelResponse.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{effectChannelResponse}, this, f68480a, false, 77862, new Class[]{EffectChannelResponse.class}, Void.TYPE);
                        return;
                    }
                    if (!a.this.a(effectChannelResponse, z, false)) {
                        a.this.a(z);
                    }
                    a.this.a(true, 0, (Exception) null);
                }
            });
        }
    }

    public final void b(boolean z) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f68474a, false, 77853, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f68474a, false, 77853, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.k != null) {
            MvTemplateView mvTemplateView = this.k;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, mvTemplateView, MvTemplateView.f68460a, false, 77887, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                MvTemplateView mvTemplateView2 = mvTemplateView;
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, mvTemplateView2, MvTemplateView.f68460a, false, 77887, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            int dip2Px = (int) UIUtils.dip2Px(mvTemplateView.getContext(), 16.0f);
            if (mvTemplateView.f68465f != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) mvTemplateView.f68465f.getLayoutParams();
                if (z) {
                    f2 = ((float) dip2Px) + UIUtils.dip2Px(mvTemplateView.getContext(), 65.0f);
                } else {
                    f2 = UIUtils.dip2Px(mvTemplateView.getContext(), 65.0f);
                }
                layoutParams.bottomMargin = (int) f2;
                mvTemplateView.f68465f.setLayoutParams(layoutParams);
            }
        }
    }

    public final void a(Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, this, f68474a, false, 77835, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect}, this, f68474a, false, 77835, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        this.m = effect;
        if (effect == null) {
            c(true);
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f68474a, false, 77841, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f68474a, false, 77841, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.k != null) {
            com.bytedance.ies.dmt.ui.d.a.b(this.k.getContext(), str).a();
            this.k.b();
        }
    }

    public a(FragmentActivity fragmentActivity, MvTemplateView mvTemplateView) {
        if (fragmentActivity != null && !fragmentActivity.isFinishing()) {
            this.f68475b = fragmentActivity;
            this.k = mvTemplateView;
            this.k.setOnClickListener(b.f68500b);
            this.k.setMvThemeClickListener(this);
            this.l = new EffectPlatform(fragmentActivity, com.ss.android.ugc.aweme.port.in.a.h.c(), com.ss.android.ugc.aweme.port.in.a.D.getOKHttpClient());
            if (fragmentActivity instanceof e) {
                ((e) fragmentActivity).a((com.ss.android.ugc.aweme.base.activity.b) new c(this));
            }
            this.f68479f = this.f68475b.getResources().getString(C0906R.string.abg);
            this.n = this.f68475b.getResources().getString(C0906R.string.b1c);
        }
    }

    private void a(String str, j jVar) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, jVar}, this, f68474a, false, 77851, new Class[]{String.class, j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, jVar}, this, f68474a, false, 77851, new Class[]{String.class, j.class}, Void.TYPE);
        } else if (jVar != null) {
            r.a(str2, (Map) e().a("mv_id", jVar.a()).a("mv_name", jVar.h()).f34114b);
        }
    }

    public final void a(j jVar, int i2) {
        j jVar2 = jVar;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{jVar2, Integer.valueOf(i2)}, this, f68474a, false, 77848, new Class[]{j.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar2, Integer.valueOf(i2)}, this, f68474a, false, 77848, new Class[]{j.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i3 == 2) {
            dismiss();
            if (this.f68475b instanceof VideoRecordNewActivity) {
                ((VideoRecordNewActivity) this.f68475b).P.k().a((Object) this.k.getCloseView(), (bc) new com.ss.android.ugc.aweme.tools.j("close_view"));
            }
        } else if (i3 == 1) {
            if (this.k == null || this.k.getVisibility() == 0) {
                if (PatchProxy.isSupport(new Object[]{jVar2}, this, f68474a, false, 77847, new Class[]{j.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{jVar2}, this, f68474a, false, 77847, new Class[]{j.class}, Void.TYPE);
                } else if (jVar2 != null && jVar2.f68726d > 0) {
                    String e2 = jVar.e();
                    if (com.ss.android.ugc.aweme.video.b.b(e2)) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("key_photo_select_min_count", jVar2.f68726d);
                        bundle.putInt("key_photo_select_max_count", jVar2.f68727e);
                        bundle.putString("key_mv_hint_text", jVar.j());
                        bundle.putString("key_mv_resource_zip_path", e2);
                        bundle.putParcelable("key_select_mv_data", jVar);
                        bundle.putParcelable("key_short_video_context", this.f68477d);
                        bundle.putInt("key_support_flag", 3);
                        String b2 = b(jVar2.f68724b);
                        if (b2 != null) {
                            bundle.putString("Key_challenge_id", b2);
                        }
                        bundle.putInt("key_choose_scene", 2);
                        MvChoosePhotoActivity.a(this.f68475b, bundle, 10001);
                    }
                }
                this.f68476c = jVar2;
                Effect effect = jVar2.f68724b;
                if (PatchProxy.isSupport(new Object[]{effect}, this, f68474a, false, 77855, new Class[]{Effect.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{effect}, this, f68474a, false, 77855, new Class[]{Effect.class}, Void.TYPE);
                } else {
                    this.j = null;
                    String b3 = b(effect);
                    if (b3 != null) {
                        com.ss.android.ugc.aweme.port.in.a.f61122e.a(b3, null, 0, 0, new f(this));
                    }
                }
                a("select_mv", jVar);
            }
        } else if (i3 == 3) {
            a("mv_show", jVar);
        }
    }
}

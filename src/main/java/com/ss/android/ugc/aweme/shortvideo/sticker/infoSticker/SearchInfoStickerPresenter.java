package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LifecycleRegistry;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.w.b.a;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SearchInfoStickerPresenter implements LifecycleObserver, LifecycleOwner, View.OnClickListener, TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4012a;

    /* renamed from: b  reason: collision with root package name */
    FragmentActivity f4013b;

    /* renamed from: c  reason: collision with root package name */
    public w f4014c;

    /* renamed from: d  reason: collision with root package name */
    public a f4015d;

    /* renamed from: e  reason: collision with root package name */
    boolean f4016e;

    /* renamed from: f  reason: collision with root package name */
    public PublishSubject<String> f4017f;
    int g;
    int h;
    boolean i = true;
    private LifecycleRegistry j;
    private List<p> k;
    private TextWatcher l = new TextWatcher() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69813a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            if (PatchProxy.isSupport(new Object[]{editable}, this, f69813a, false, 79458, new Class[]{Editable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editable}, this, f69813a, false, 79458, new Class[]{Editable.class}, Void.TYPE);
                return;
            }
            String obj = editable.toString();
            w wVar = SearchInfoStickerPresenter.this.f4014c;
            if (PatchProxy.isSupport(new Object[]{obj}, wVar, w.f70115a, false, 79462, new Class[]{String.class}, Void.TYPE)) {
                w wVar2 = wVar;
                PatchProxy.accessDispatch(new Object[]{obj}, wVar2, w.f70115a, false, 79462, new Class[]{String.class}, Void.TYPE);
            } else if (StringUtils.isEmpty(obj)) {
                wVar.f70119e.setVisibility(8);
            } else {
                wVar.f70119e.setVisibility(0);
            }
            SearchInfoStickerPresenter.this.f4017f.onNext(obj);
            if (StringUtils.isEmpty(obj)) {
                SearchInfoStickerPresenter.this.a(0);
            }
        }
    };

    interface a {
        void a();
    }

    @NonNull
    public Lifecycle getLifecycle() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onActivityDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f4012a, false, 79451, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4012a, false, 79451, new Class[0], Void.TYPE);
            return;
        }
        this.j.markState(Lifecycle.State.DESTROYED);
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onActivityStop() {
        if (PatchProxy.isSupport(new Object[0], this, f4012a, false, 79450, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4012a, false, 79450, new Class[0], Void.TYPE);
            return;
        }
        this.j.markState(Lifecycle.State.CREATED);
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f4012a, false, 79439, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4012a, false, 79439, new Class[0], Void.TYPE);
            return;
        }
        this.f4016e = false;
        w wVar = this.f4014c;
        if (PatchProxy.isSupport(new Object[0], wVar, w.f70115a, false, 79469, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], wVar, w.f70115a, false, 79469, new Class[0], Void.TYPE);
        } else {
            wVar.a();
            wVar.k.beginTransaction().remove(wVar.i).commit();
            wVar.o = true;
            wVar.f70120f.setVisibility(8);
            KeyboardUtils.c(wVar.f70118d);
            if (wVar.p != null) {
                wVar.p.a();
            }
        }
        if (this.f4015d != null) {
            this.f4015d.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{0}, this, f4012a, false, 79442, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{0}, this, f4012a, false, 79442, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (!Lists.isEmpty(this.k)) {
            ((SearchInfoStickerViewModel) ViewModelProviders.of(this.f4013b).get(SearchInfoStickerViewModel.class)).f69816a.setValue(Boolean.FALSE);
            this.f4014c.a(this.k, false);
        } else {
            InfoStickerModule.a(this.f4013b).a("giphy", 0, 30).observe(this, new s(this));
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f4012a, false, 79437, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f4012a, false, 79437, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view.getId() == C0906R.id.di2) {
            dismiss();
            return;
        }
        if (view.getId() == C0906R.id.ns) {
            if (PatchProxy.isSupport(new Object[0], this, f4012a, false, 79436, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f4012a, false, 79436, new Class[0], Void.TYPE);
                return;
            }
            this.f4014c.a();
            a(0);
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f4012a, false, 79435, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f4012a, false, 79435, new Class[]{String.class}, Void.TYPE);
        } else if (StringUtils.isEmpty(str)) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this.f4013b, (int) C0906R.string.f4486dmt).a();
        } else {
            if (PatchProxy.isSupport(new Object[]{str}, this, f4012a, false, 79444, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f4012a, false, 79444, new Class[]{String.class}, Void.TYPE);
                return;
            }
            InfoStickerModule.a(this.f4013b).b(str, "giphy", 0, 30).observe(this, new u(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        Lifecycle.State state;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f4012a, false, 79440, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f4012a, false, 79440, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        LifecycleRegistry lifecycleRegistry = this.j;
        if (z) {
            state = Lifecycle.State.RESUMED;
        } else {
            state = Lifecycle.State.CREATED;
        }
        lifecycleRegistry.markState(state);
    }

    SearchInfoStickerPresenter(View view, FragmentActivity fragmentActivity) {
        this.f4013b = fragmentActivity;
        this.k = new ArrayList();
        fragmentActivity.getLifecycle().addObserver(this);
        this.j = new LifecycleRegistry(fragmentActivity);
        this.f4014c = new w(view, this.f4013b, this.l);
        this.f4017f = PublishSubject.create();
        this.f4017f.debounce(600, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe((Consumer<? super T>) new q<Object>(this));
    }

    public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{textView, Integer.valueOf(i2), keyEvent}, this, f4012a, false, 79441, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{textView, Integer.valueOf(i2), keyEvent}, this, f4012a, false, 79441, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (i2 != 3) {
            return false;
        } else {
            a(this.f4014c.b());
            return true;
        }
    }

    private void a(ProviderEffectModel providerEffectModel, boolean z, boolean z2) {
        ProviderEffectModel providerEffectModel2 = providerEffectModel;
        if (PatchProxy.isSupport(new Object[]{providerEffectModel2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f4012a, false, 79448, new Class[]{ProviderEffectModel.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{providerEffectModel2, Byte.valueOf(z), Byte.valueOf(z2)}, this, f4012a, false, 79448, new Class[]{ProviderEffectModel.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        ((SearchInfoStickerViewModel) ViewModelProviders.of(this.f4013b).get(SearchInfoStickerViewModel.class)).f69816a.setValue(Boolean.valueOf(z));
        List a2 = p.a(providerEffectModel2.sticker_list);
        this.i = providerEffectModel2.has_more;
        if (z) {
            this.h = providerEffectModel2.cursor;
        } else {
            this.g = providerEffectModel2.cursor;
            this.k.addAll(a2);
        }
        this.f4014c.a(a2, z2);
    }

    /* access modifiers changed from: package-private */
    public void b(a.C0799a aVar, ProviderEffectModel providerEffectModel, boolean z) {
        ProviderEffectModel providerEffectModel2 = providerEffectModel;
        if (PatchProxy.isSupport(new Object[]{aVar, providerEffectModel2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f4012a, false, 79447, new Class[]{a.C0799a.class, ProviderEffectModel.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, providerEffectModel2, Byte.valueOf(z)}, this, f4012a, false, 79447, new Class[]{a.C0799a.class, ProviderEffectModel.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        switch (aVar) {
            case LOADING:
                this.f4014c.b(0);
                return;
            case ERROR:
                this.f4014c.b(2);
                return;
            case SUCCESS:
                if (!Lists.isEmpty(providerEffectModel2.sticker_list)) {
                    this.f4014c.b(-1);
                    a(providerEffectModel, z, true);
                    break;
                } else {
                    this.f4014c.b(1);
                    return;
                }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(a.C0799a aVar, ProviderEffectModel providerEffectModel, boolean z) {
        ProviderEffectModel providerEffectModel2 = providerEffectModel;
        if (PatchProxy.isSupport(new Object[]{aVar, providerEffectModel2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f4012a, false, 79446, new Class[]{a.C0799a.class, ProviderEffectModel.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, providerEffectModel2, Byte.valueOf(z)}, this, f4012a, false, 79446, new Class[]{a.C0799a.class, ProviderEffectModel.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        switch (aVar) {
            case LOADING:
                w wVar = this.f4014c;
                if (PatchProxy.isSupport(new Object[0], wVar, w.f70115a, false, 79463, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], wVar, w.f70115a, false, 79463, new Class[0], Void.TYPE);
                    break;
                } else {
                    wVar.h.setVisibility(4);
                    wVar.g.d();
                    return;
                }
            case ERROR:
                this.f4014c.a(2);
                return;
            case SUCCESS:
                this.f4014c.b(-1);
                if (!Lists.isEmpty(providerEffectModel2.sticker_list)) {
                    this.f4014c.a(-1);
                    a(providerEffectModel2, z, false);
                    break;
                } else {
                    this.f4014c.a(1);
                    return;
                }
        }
    }
}

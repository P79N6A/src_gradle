package com.ss.android.ugc.aweme.commercialize.im;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.transition.Slide;
import android.support.transition.TransitionManager;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.q;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.dr;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements com.ss.android.ugc.aweme.im.service.b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38882a;

    /* renamed from: b  reason: collision with root package name */
    public static final q<String, com.ss.android.ugc.aweme.commercialize.im.model.b> f38883b = new q<>(TimeUnit.HOURS.toMillis(2));

    /* renamed from: com.ss.android.ugc.aweme.commercialize.im.a$a  reason: collision with other inner class name */
    static class C0506a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38884a;

        /* renamed from: b  reason: collision with root package name */
        public final String f38885b;

        /* renamed from: c  reason: collision with root package name */
        final com.ss.android.ugc.aweme.im.service.b.b f38886c;

        /* renamed from: d  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.im.service.model.a f38887d;

        private void a(com.ss.android.ugc.aweme.commercialize.im.model.b bVar, boolean z) {
            com.ss.android.ugc.aweme.commercialize.im.model.b bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{bVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f38884a, false, 30812, new Class[]{com.ss.android.ugc.aweme.commercialize.im.model.b.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar2, Byte.valueOf(z)}, this, f38884a, false, 30812, new Class[]{com.ss.android.ugc.aweme.commercialize.im.model.b.class, Boolean.TYPE}, Void.TYPE);
            } else if (bVar2 != null && !CollectionUtils.isEmpty(bVar2.f38927b)) {
                boolean z2 = !z;
                LayoutInflater from = LayoutInflater.from(this.f38886c.a().getContext());
                LinearLayout linearLayout = (LinearLayout) from.inflate(C0906R.layout.a4y, this.f38886c.a(), false);
                if (!z) {
                    this.f38886c.b().setVisibility(8);
                    linearLayout.setVisibility(0);
                } else {
                    this.f38886c.b().setVisibility(0);
                    linearLayout.setVisibility(8);
                }
                this.f38886c.a().addView(linearLayout, 0);
                ImageView imageView = (ImageView) from.inflate(C0906R.layout.vt, this.f38886c.a(), false);
                imageView.setSelected(z2);
                imageView.setActivated(false);
                imageView.setOnClickListener(new d(this.f38886c, linearLayout));
                if (z) {
                    TransitionManager.beginDelayedTransition(this.f38886c.a(), new Slide(8388611));
                }
                this.f38886c.a().addView(imageView, 0);
                imageView.getViewTreeObserver().addOnGlobalLayoutListener(new c(this, imageView));
                SparseArray a2 = bVar.a();
                for (int i = 0; i < bVar2.f38927b.size(); i++) {
                    View view = new View(linearLayout.getContext());
                    view.setBackgroundColor(ContextCompat.getColor(this.f38886c.a().getContext(), C0906R.color.o));
                    linearLayout.addView(view, new LinearLayout.LayoutParams(this.f38886c.a().getResources().getDimensionPixelOffset(C0906R.dimen.fx), this.f38886c.a().getResources().getDimensionPixelOffset(C0906R.dimen.fw)));
                    com.ss.android.ugc.aweme.commercialize.im.model.c cVar = bVar2.f38927b.get(i);
                    List list = (List) a2.get(i);
                    ItemInputMenu a3 = ItemInputMenu.a(linearLayout, true);
                    a3.setText(cVar.f38930b);
                    if (list != null) {
                        a3.setLeftVisible(0);
                    }
                    c cVar2 = new c(this.f38886c, a3, cVar, list, null, new b(this.f38885b, cVar.f38929a, cVar.f38930b, this.f38887d));
                    a3.setOnClickListener(cVar2);
                    linearLayout.addView(a3);
                }
            }
        }

        C0506a(String str, com.ss.android.ugc.aweme.im.service.b.b bVar, com.ss.android.ugc.aweme.im.service.model.a aVar) {
            this.f38885b = str;
            this.f38886c = bVar;
            this.f38887d = aVar;
        }

        public final void a(com.ss.android.ugc.aweme.commercialize.im.model.b bVar, long j, com.ss.android.ugc.aweme.im.service.model.a aVar) {
            com.ss.android.ugc.aweme.commercialize.im.model.b bVar2 = bVar;
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{bVar2, new Long(j2), aVar}, this, f38884a, false, 30811, new Class[]{com.ss.android.ugc.aweme.commercialize.im.model.b.class, Long.TYPE, com.ss.android.ugc.aweme.im.service.model.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar2, new Long(j2), aVar}, this, f38884a, false, 30811, new Class[]{com.ss.android.ugc.aweme.commercialize.im.model.b.class, Long.TYPE, com.ss.android.ugc.aweme.im.service.model.a.class}, Void.TYPE);
                return;
            }
            if (j2 > 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", (int) j2);
                    n.a("aweme_im_bluev_get_duration", jSONObject, (JSONObject) null);
                } catch (JSONException unused) {
                }
            }
            if (j2 < 200) {
                a(bVar2, false);
                return;
            }
            if (j2 < 400) {
                a(bVar2, true);
            }
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38891a;

        /* renamed from: b  reason: collision with root package name */
        public final String f38892b;

        /* renamed from: c  reason: collision with root package name */
        public final int f38893c;

        /* renamed from: d  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.im.service.model.a f38894d;

        /* renamed from: e  reason: collision with root package name */
        private final String f38895e;

        public final void a(boolean z) {
            String str;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f38891a, false, 30817, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f38891a, false, 30817, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("author_id", this.f38892b);
            if (!z) {
                switch (this.f38893c) {
                    case 1:
                        str = "url_menu";
                        break;
                    case 2:
                        str = "autoreply_menu";
                        break;
                    default:
                        str = "";
                        break;
                }
            } else {
                str = "compound_menu";
            }
            hashMap.put("menu_type", str);
            hashMap.put("menu_name", this.f38895e);
            r.a("click_menu", (Map) hashMap);
            Context context = GlobalContext.getContext();
            com.ss.android.ugc.aweme.im.service.model.a aVar = this.f38894d;
            if (PatchProxy.isSupport(new Object[]{context, aVar}, null, g.f39316a, true, 31580, new Class[]{Context.class, com.ss.android.ugc.aweme.im.service.model.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, aVar}, null, g.f39316a, true, 31580, new Class[]{Context.class, com.ss.android.ugc.aweme.im.service.model.a.class}, Void.TYPE);
                return;
            }
            if (aVar != null) {
                com.ss.android.ugc.aweme.commercialize.log.d.a().a("message_ad").b("otherclick").g(aVar.getLogExtra()).c(aVar.getCreativeId()).d("endbar").a(context);
            }
        }

        b(String str, int i, String str2, com.ss.android.ugc.aweme.im.service.model.a aVar) {
            this.f38892b = str;
            this.f38893c = i;
            this.f38895e = str2;
            this.f38894d = aVar;
        }
    }

    static class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38896a;

        /* renamed from: b  reason: collision with root package name */
        private final com.ss.android.ugc.aweme.im.service.b.b f38897b;

        /* renamed from: c  reason: collision with root package name */
        private final ItemInputMenu f38898c;

        /* renamed from: d  reason: collision with root package name */
        private final com.ss.android.ugc.aweme.commercialize.im.model.c f38899d;

        /* renamed from: e  reason: collision with root package name */
        private final List<com.ss.android.ugc.aweme.commercialize.im.model.c> f38900e;

        /* renamed from: f  reason: collision with root package name */
        private PopupWindow[] f38901f;
        private final b g;

        public final void onClick(View view) {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{view}, this, f38896a, false, 30818, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f38896a, false, 30818, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (this.f38901f != null) {
                for (PopupWindow popupWindow : this.f38901f) {
                    if (PatchProxy.isSupport(new Object[]{popupWindow}, null, e.f38913a, true, 30819, new Class[]{PopupWindow.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{popupWindow}, null, e.f38913a, true, 30819, new Class[]{PopupWindow.class}, Void.TYPE);
                    } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        popupWindow.dismiss();
                    } else {
                        throw new IllegalStateException("debug check! this method should be called from main thread!");
                    }
                }
                this.f38901f = null;
            }
            if (this.f38900e == null || this.f38900e.isEmpty()) {
                this.g.a(false);
                switch (this.f38899d.f38929a) {
                    case 1:
                        f.f34171e.a(this.f38898c.getContext(), this.f38899d.f38931c, null);
                        return;
                    case 2:
                        this.f38897b.a(this.f38899d.f38930b);
                        return;
                    default:
                        return;
                }
            } else {
                this.g.a(true);
                View inflate = LayoutInflater.from(this.f38898c.getContext()).inflate(C0906R.layout.a4z, null, false);
                LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0906R.id.bmh);
                PopupWindow[] popupWindowArr = {null};
                boolean z2 = true;
                for (com.ss.android.ugc.aweme.commercialize.im.model.c next : this.f38900e) {
                    if (z2) {
                        z2 = false;
                    } else {
                        View view2 = new View(linearLayout.getContext());
                        view2.setBackgroundColor(ContextCompat.getColor(linearLayout.getContext(), C0906R.color.zf));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, u.a(0.5d));
                        layoutParams.leftMargin = u.a(12.0d);
                        layoutParams.rightMargin = u.a(12.0d);
                        linearLayout.addView(view2, layoutParams);
                    }
                    ItemInputMenu a2 = ItemInputMenu.a(linearLayout, z);
                    a2.setText(next.f38930b);
                    c cVar = new c(this.f38897b, a2, next, null, popupWindowArr, new b(this.g.f38892b, next.f38929a, next.f38930b, this.g.f38894d));
                    a2.setOnClickListener(cVar);
                    linearLayout.addView(a2);
                    z = false;
                }
                int width = this.f38898c.getWidth();
                inflate.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(com.bytedance.ies.dmt.ui.e.a.a(inflate.getContext()) - this.f38898c.getHeight(), Integer.MIN_VALUE));
                int measuredHeight = inflate.getMeasuredHeight();
                PopupWindow popupWindow2 = new PopupWindow(inflate, width, measuredHeight);
                popupWindow2.setBackgroundDrawable(new ColorDrawable(0));
                popupWindow2.setFocusable(true);
                popupWindow2.setOutsideTouchable(true);
                popupWindow2.setAnimationStyle(C0906R.anim.bq);
                popupWindowArr[0] = popupWindow2;
                popupWindow2.showAsDropDown(this.f38898c, 0, ((-measuredHeight) - this.f38898c.getHeight()) - this.f38898c.getResources().getDimensionPixelOffset(C0906R.dimen.fv));
            }
        }

        c(com.ss.android.ugc.aweme.im.service.b.b bVar, ItemInputMenu itemInputMenu, com.ss.android.ugc.aweme.commercialize.im.model.c cVar, List<com.ss.android.ugc.aweme.commercialize.im.model.c> list, PopupWindow[] popupWindowArr, b bVar2) {
            this.f38897b = bVar;
            this.f38898c = itemInputMenu;
            this.f38899d = cVar;
            this.f38900e = list;
            this.f38901f = popupWindowArr;
            this.g = bVar2;
        }
    }

    static class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38902a;

        /* renamed from: b  reason: collision with root package name */
        private final com.ss.android.ugc.aweme.im.service.b.b f38903b;

        /* renamed from: c  reason: collision with root package name */
        private final View f38904c;

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f38902a, false, 30820, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f38902a, false, 30820, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (view.isSelected()) {
                view.setSelected(false);
                this.f38903b.b().setVisibility(0);
                this.f38904c.setVisibility(8);
            } else {
                view.setSelected(true);
                this.f38903b.b().setVisibility(8);
                this.f38904c.setVisibility(0);
            }
            r.a("click_change_button", (Map) null);
        }

        d(com.ss.android.ugc.aweme.im.service.b.b bVar, View view) {
            this.f38903b = bVar;
            this.f38904c = view;
        }
    }

    public final void a(String str, int i, String str2, com.ss.android.ugc.aweme.im.service.b.b bVar, com.ss.android.ugc.aweme.im.service.model.a aVar) {
        com.google.common.util.concurrent.q<com.ss.android.ugc.aweme.commercialize.im.model.b> qVar;
        String str3 = str;
        com.ss.android.ugc.aweme.im.service.b.b bVar2 = bVar;
        com.ss.android.ugc.aweme.im.service.model.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), str2, bVar2, aVar2}, this, f38882a, false, 30809, new Class[]{String.class, Integer.TYPE, String.class, com.ss.android.ugc.aweme.im.service.b.b.class, com.ss.android.ugc.aweme.im.service.model.a.class}, Void.TYPE)) {
            Object[] objArr = {str3, Integer.valueOf(i), str2, bVar2, aVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f38882a, false, 30809, new Class[]{String.class, Integer.TYPE, String.class, com.ss.android.ugc.aweme.im.service.b.b.class, com.ss.android.ugc.aweme.im.service.model.a.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str2)) {
            C0506a aVar3 = new C0506a(str3, bVar2, aVar2);
            if (PatchProxy.isSupport(new Object[0], aVar3, C0506a.f38884a, false, 30810, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar3, C0506a.f38884a, false, 30810, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.commercialize.im.model.b bVar3 = (com.ss.android.ugc.aweme.commercialize.im.model.b) f38883b.a(aVar3.f38885b);
            if (bVar3 != null) {
                aVar3.a(bVar3, 0, aVar3.f38887d);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            String str4 = aVar3.f38885b;
            if (PatchProxy.isSupport(new Object[]{str4}, null, EnterpriseIMApi.f38879a, true, 30807, new Class[]{String.class}, com.google.common.util.concurrent.q.class)) {
                qVar = (com.google.common.util.concurrent.q) PatchProxy.accessDispatch(new Object[]{str4}, null, EnterpriseIMApi.f38879a, true, 30807, new Class[]{String.class}, com.google.common.util.concurrent.q.class);
            } else {
                qVar = EnterpriseIMApi.a().getIMSettings(str4, dr.a().a(str4));
            }
            l.a(qVar, new k<com.ss.android.ugc.aweme.commercialize.im.model.b>(currentTimeMillis) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f38888a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ long f38889b;

                public final void onFailure(Throwable th) {
                }

                public final /* synthetic */ void onSuccess(@Nullable Object obj) {
                    com.ss.android.ugc.aweme.commercialize.im.model.b bVar = (com.ss.android.ugc.aweme.commercialize.im.model.b) obj;
                    if (PatchProxy.isSupport(new Object[]{bVar}, this, f38888a, false, 30816, new Class[]{com.ss.android.ugc.aweme.commercialize.im.model.b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar}, this, f38888a, false, 30816, new Class[]{com.ss.android.ugc.aweme.commercialize.im.model.b.class}, Void.TYPE);
                        return;
                    }
                    if (bVar != null) {
                        q<String, com.ss.android.ugc.aweme.commercialize.im.model.b> qVar = a.f38883b;
                        String str = C0506a.this.f38885b;
                        if (PatchProxy.isSupport(new Object[]{str, bVar}, qVar, q.f39813a, false, 32421, new Class[]{Object.class, Object.class}, Void.TYPE)) {
                            Object[] objArr = {str, bVar};
                            q<String, com.ss.android.ugc.aweme.commercialize.im.model.b> qVar2 = qVar;
                            PatchProxy.accessDispatch(objArr, qVar2, q.f39813a, false, 32421, new Class[]{Object.class, Object.class}, Void.TYPE);
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            qVar.f39815c.writeLock().lock();
                            try {
                                ListIterator listIterator = qVar.f39816d.listIterator();
                                while (listIterator.hasNext()) {
                                    q.a aVar = (q.a) listIterator.next();
                                    if (aVar.f39819c < currentTimeMillis || str.equals(aVar.f39817a)) {
                                        listIterator.remove();
                                    }
                                }
                                qVar.f39816d.add(new q.a(str, bVar, currentTimeMillis + qVar.f39814b));
                            } finally {
                                qVar.f39815c.writeLock().unlock();
                            }
                        }
                        C0506a.this.a(bVar, System.currentTimeMillis() - this.f38889b, C0506a.this.f38887d);
                    }
                }

                {
                    this.f38889b = r2;
                }
            }, new b(aVar3));
        }
    }
}

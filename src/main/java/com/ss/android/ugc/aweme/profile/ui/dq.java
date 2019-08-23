package com.ss.android.ugc.aweme.profile.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.d.f;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.common.ui.b;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.profile.api.SchoolApiManager;
import com.ss.android.ugc.aweme.profile.model.SchoolStruct;
import com.ss.android.ugc.aweme.profile.model.SearchSchoolModel;
import com.ss.android.ugc.aweme.profile.presenter.z;
import com.ss.android.ugc.aweme.profile.ui.SchoolSearchAdapter;
import com.ss.android.ugc.aweme.utils.permission.a;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class dq extends Dialog implements TextWatcher, View.OnClickListener, TextView.OnEditorActionListener, WeakHandler.IHandler, f, LoadMoreRecyclerViewAdapter.a, c<SchoolStruct.School>, o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62680a;

    /* renamed from: b  reason: collision with root package name */
    public SchoolSearchAdapter f62681b;

    /* renamed from: c  reason: collision with root package name */
    public a f62682c;

    /* renamed from: d  reason: collision with root package name */
    private TextTitleBar f62683d;

    /* renamed from: e  reason: collision with root package name */
    private EditText f62684e;

    /* renamed from: f  reason: collision with root package name */
    private DmtTextView f62685f;
    private RecyclerView g;
    private DmtStatusView h;
    private View i;
    private z j;
    private SearchSchoolModel k;
    private String l;
    private String m;
    private Context n;
    private String o = "";
    private WeakHandler p;

    public interface a {
        void a(String str);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public final void c(List<SchoolStruct.School> list, boolean z) {
    }

    public final void d(Exception exc) {
    }

    public final void z_() {
    }

    public final void W_() {
        if (PatchProxy.isSupport(new Object[0], this, f62680a, false, 69028, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62680a, false, 69028, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.poi.a f2 = af.a(getContext()).f();
        if (f2 != null) {
            a(f2);
        }
        g();
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (PatchProxy.isSupport(new Object[0], this, f62680a, false, 69033, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62680a, false, 69033, new Class[0], Void.TYPE);
        } else if (getOwnerActivity() != null) {
            b.a(getOwnerActivity(), (View) this.f62684e);
            this.f62684e.clearFocus();
        }
    }

    public final void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f62680a, false, 69015, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62680a, false, 69015, new Class[0], Void.TYPE);
            return;
        }
        this.j.a(4);
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f62680a, false, 69016, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62680a, false, 69016, new Class[0], Void.TYPE);
            return;
        }
        this.g.setVisibility(4);
        this.h.d();
    }

    public final void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f62680a, false, 69026, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62680a, false, 69026, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f62680a, false, 69027, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62680a, false, 69027, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        af.a((Context) k.a()).c(this);
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f62680a, false, 69020, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62680a, false, 69020, new Class[0], Void.TYPE);
            return;
        }
        this.f62681b.showLoadMoreLoading();
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, f62680a, false, 69032, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62680a, false, 69032, new Class[0], Void.TYPE);
            return;
        }
        n.a("location_log", "", com.ss.android.ugc.aweme.app.d.c.a().a("service", "search location").a("errorDesc", "no available locations near by").a("action", this.o).b());
    }

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, f62680a, false, 69034, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62680a, false, 69034, new Class[0], Void.TYPE);
            return;
        }
        r.onEvent(new MobClick().setLabelName("video_publish_page").setEventName("search_poi").setJsonObject(new t().a("key_word", this.o).a()));
        r.a("search_poi", (Map) d.a().a("enter_from", "video_publish_page").a("key_word", this.o).f34114b);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f62680a, false, 69004, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62680a, false, 69004, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.poi.a a2 = af.a((Context) k.a()).a((f) this);
        if (a2 != null) {
            af.a(getContext()).d();
            a(a2);
            SchoolApiManager.a((Handler) this.p, this.l, this.m);
        } else if (this.f62681b != null) {
            this.f62681b.a(h());
        }
        g();
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f62680a, false, 69014, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62680a, false, 69014, new Class[0], Void.TYPE);
            return;
        }
        i();
        if (PatchProxy.isSupport(new Object[]{this}, null, dt.f62698a, true, 69044, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, dt.f62698a, true, 69044, new Class[]{Dialog.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            super.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f62680a, false, 69008, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62680a, false, 69008, new Class[0], Void.TYPE);
            return;
        }
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(0);
        }
        Intent intent = new Intent(getContext(), CrossPlatformActivity.class);
        intent.setData(Uri.parse("https://aweme.snssdk.com/falcon/school_declare?hide_nav_bar=1"));
        getContext().startActivity(intent);
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f62680a, false, 69011, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62680a, false, 69011, new Class[0], Void.TYPE);
            return;
        }
        this.o = this.f62684e.getText().toString();
        this.j.a(1, this.o);
        this.f62681b.a(this.o);
        k();
    }

    public final List<SchoolStruct.School> h() {
        if (PatchProxy.isSupport(new Object[0], this, f62680a, false, 69031, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f62680a, false, 69031, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        SchoolStruct.School school = new SchoolStruct.School();
        school.name = getContext().getString(C0906R.string.bon);
        arrayList.add(school);
        return arrayList;
    }

    public final void show() {
        if (PatchProxy.isSupport(new Object[0], this, f62680a, false, 69013, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62680a, false, 69013, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        this.f62684e.getText().clear();
        if (PatchProxy.isSupport(new Object[0], this, f62680a, false, 69003, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62680a, false, 69003, new Class[0], Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.utils.permission.a.a((Context) (Activity) this.n, af.f2626c)) {
            com.ss.android.ugc.aweme.utils.permission.a.b((Activity) this.n, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST, af.f2626c, new a.C0792a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62686a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f62686a, false, 69038, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f62686a, false, 69038, new Class[0], Void.TYPE);
                        return;
                    }
                    dq.this.b();
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f62686a, false, 69039, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f62686a, false, 69039, new Class[0], Void.TYPE);
                        return;
                    }
                    if (dq.this.f62681b != null) {
                        dq.this.f62681b.a(dq.this.h());
                    }
                    dq.this.g();
                }
            });
        } else {
            b();
        }
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f62680a, false, 69018, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62680a, false, 69018, new Class[0], Void.TYPE);
            return;
        }
        if (this.f62681b.mShowFooter) {
            this.f62681b.setShowFooter(false);
            this.f62681b.notifyDataSetChanged();
            this.f62681b.showLoadMoreEmpty();
        }
        this.g.setVisibility(4);
        this.h.e();
        j();
        a(false);
    }

    private void a(@NonNull com.ss.android.ugc.aweme.poi.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f62680a, false, 69005, new Class[]{com.ss.android.ugc.aweme.poi.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f62680a, false, 69005, new Class[]{com.ss.android.ugc.aweme.poi.a.class}, Void.TYPE);
            return;
        }
        String[] a2 = p.a(aVar);
        this.m = a2[0];
        this.l = a2[1];
    }

    public final void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f62680a, false, 69021, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f62680a, false, 69021, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.f62681b.showLoadMoreError();
    }

    private void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f62680a, false, 69035, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f62680a, false, 69035, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        r.a("search_poi_result", (Map) d.a().a("enter_from", "video_publish_page").a("key_word", this.o).a("is_success", z ? 1 : 0).f34114b);
    }

    public final void afterTextChanged(Editable editable) {
        Editable editable2 = editable;
        if (PatchProxy.isSupport(new Object[]{editable2}, this, f62680a, false, 69024, new Class[]{Editable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{editable2}, this, f62680a, false, 69024, new Class[]{Editable.class}, Void.TYPE);
            return;
        }
        String obj = editable.toString();
        if (obj.contains("\n")) {
            com.bytedance.ies.dmt.ui.d.a.c(getContext(), (int) C0906R.string.bi4).a();
            int indexOf = obj.indexOf("\n");
            editable2.replace(indexOf, indexOf + 1, "");
        }
    }

    public final void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f62680a, false, 69030, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f62680a, false, 69030, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message.what == 1) {
            if (message.obj instanceof Exception) {
                if (this.f62681b != null) {
                    this.f62681b.a(h());
                }
            } else if (message.obj instanceof SchoolStruct) {
                SchoolStruct schoolStruct = (SchoolStruct) message.obj;
                if (this.f62681b != null) {
                    this.f62681b.a(schoolStruct.schoolList);
                }
            }
        }
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62680a, false, 69012, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62680a, false, 69012, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.c3b) {
            g();
            i();
            return;
        }
        if (id == C0906R.id.ns) {
            this.f62684e.setText("");
            if (!StringUtils.isEmpty(this.o)) {
                g();
            }
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f62680a, false, 69009, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f62680a, false, 69009, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onWindowFocusChanged(z);
        if (z) {
            Window window = getWindow();
            if (window != null) {
                window.setWindowAnimations(C0906R.style.fi);
            }
        }
    }

    public final void b(Exception exc) {
        com.bytedance.ies.dmt.ui.widget.c cVar;
        if (PatchProxy.isSupport(new Object[]{exc}, this, f62680a, false, 69017, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f62680a, false, 69017, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.g.setVisibility(4);
        if (this.f62681b.mShowFooter) {
            this.f62681b.setShowFooter(false);
            this.f62681b.notifyDataSetChanged();
        }
        if (exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            DmtStatusView dmtStatusView = this.h;
            DmtStatusView.a a2 = this.h.a();
            String errorMsg = ((com.ss.android.ugc.aweme.base.api.a.b.a) exc).getErrorMsg();
            if (PatchProxy.isSupport(new Object[]{errorMsg}, this, f62680a, false, 69010, new Class[]{String.class}, com.bytedance.ies.dmt.ui.widget.c.class)) {
                cVar = (com.bytedance.ies.dmt.ui.widget.c) PatchProxy.accessDispatch(new Object[]{errorMsg}, this, f62680a, false, 69010, new Class[]{String.class}, com.bytedance.ies.dmt.ui.widget.c.class);
            } else {
                cVar = new c.a(getContext()).b((int) C0906R.string.dmm).b(errorMsg).a(com.bytedance.ies.dmt.ui.widget.a.BORDER, C0906R.string.dms, new ds(this)).f20493a;
            }
            dmtStatusView.setBuilder(a2.b(cVar));
        }
        this.h.f();
        a(false);
        j();
    }

    public dq(@NonNull Context context) {
        super(context, C0906R.style.fu);
        setContentView(C0906R.layout.ka);
        this.n = context;
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(34);
        }
        this.p = new WeakHandler(Looper.getMainLooper(), this);
        if (PatchProxy.isSupport(new Object[0], this, f62680a, false, 69007, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62680a, false, 69007, new Class[0], Void.TYPE);
        } else {
            this.f62683d = (TextTitleBar) findViewById(C0906R.id.d3m);
            this.f62684e = (EditText) findViewById(C0906R.id.c3d);
            this.f62685f = (DmtTextView) findViewById(C0906R.id.c3b);
            this.h = (DmtStatusView) findViewById(C0906R.id.cvd);
            this.g = (RecyclerView) findViewById(C0906R.id.c3g);
            this.i = findViewById(C0906R.id.ns);
            this.f62681b = new SchoolSearchAdapter();
            this.g.setLayoutManager(new WrapLinearLayoutManager(getContext()));
            this.j = new z();
            this.k = new SearchSchoolModel();
            this.j.a(this);
            this.j.a(this.k);
            this.h.setBuilder(DmtStatusView.a.a(getContext()).a(new c.a(getContext()).a(2130840144).b((int) C0906R.string.f4486dmt).c(C0906R.string.dmu).a(com.bytedance.ies.dmt.ui.widget.a.BORDER, C0906R.string.bhx, new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62690a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f62690a, false, 69041, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f62690a, false, 69041, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    dq.this.f();
                }
            }).f20493a));
            this.f62683d.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62692a;

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f62692a, false, 69042, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f62692a, false, 69042, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    dq.this.dismiss();
                }

                public final void b(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f62692a, false, 69043, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f62692a, false, 69043, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    dq.this.f();
                }
            });
            this.f62683d.showDividerLine(false);
        }
        if (PatchProxy.isSupport(new Object[0], this, f62680a, false, 69006, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62680a, false, 69006, new Class[0], Void.TYPE);
        } else {
            this.f62685f.setOnClickListener(this);
            this.f62684e.addTextChangedListener(this);
            this.f62684e.setOnEditorActionListener(this);
            this.i.setOnClickListener(this);
            this.f62681b.setLoadMoreListener(this);
            this.f62681b.showLoadMoreEmpty();
            this.f62681b.setShowFooter(true);
            this.f62681b.notifyDataSetChanged();
            this.f62681b.f62341b = new SchoolSearchAdapter.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62688a;

                public final void a(View view, String str) {
                    if (PatchProxy.isSupport(new Object[]{view, str}, this, f62688a, false, 69040, new Class[]{View.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view, str}, this, f62688a, false, 69040, new Class[]{View.class, String.class}, Void.TYPE);
                        return;
                    }
                    if (dq.this.f62682c != null) {
                        dq.this.f62682c.a(str);
                    }
                    dq.this.dismiss();
                }
            };
            this.g.setOnTouchListener(new dr(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, f62680a, false, 69002, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62680a, false, 69002, new Class[0], Void.TYPE);
            return;
        }
        this.g.setAdapter(this.f62681b);
        this.h.d();
    }

    public final void a(List<SchoolStruct.School> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f62680a, false, 69019, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f62680a, false, 69019, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f62681b.setShowFooter(true);
        if (!z) {
            this.f62681b.showLoadMoreEmpty();
        } else {
            this.f62681b.resetLoadMoreState();
        }
        this.f62681b.setData(list);
        this.g.setVisibility(0);
        this.h.b();
        a(true);
    }

    public final void b(List<SchoolStruct.School> list, boolean z) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f62680a, false, 69022, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f62680a, false, 69022, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (list != null && !list.isEmpty()) {
            z2 = z;
        }
        if (!z2) {
            this.f62681b.showLoadMoreEmpty();
        } else {
            this.f62681b.resetLoadMoreState();
        }
        this.f62681b.setDataAfterLoadMore(list);
    }

    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{textView, Integer.valueOf(i2), keyEvent}, this, f62680a, false, 69029, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{textView, Integer.valueOf(i2), keyEvent}, this, f62680a, false, 69029, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (3 == i2) {
            i();
            g();
        }
        return false;
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        boolean z;
        int i5 = i2;
        if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f62680a, false, 69023, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f62680a, false, 69023, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        EditText editText = this.f62684e;
        if (PatchProxy.isSupport(new Object[]{editText, 20}, this, f62680a, false, 69025, new Class[]{EditText.class, Integer.TYPE}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{editText, 20}, this, f62680a, false, 69025, new Class[]{EditText.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else {
            Editable text = editText.getText();
            if (text.length() > 20) {
                com.bytedance.ies.dmt.ui.d.a.c(getContext(), (int) C0906R.string.lw).a();
                int selectionEnd = Selection.getSelectionEnd(text);
                editText.setText(text.subSequence(0, 20));
                Editable text2 = editText.getText();
                if (selectionEnd > text2.length()) {
                    selectionEnd = text2.length();
                }
                Selection.setSelection(text2, selectionEnd);
                z = true;
            } else {
                z = false;
            }
        }
        if (!z && i4 == 1 && !TextUtils.isEmpty(charSequence) && 10 == charSequence.toString().charAt(i5)) {
            com.bytedance.ies.dmt.ui.d.a.c(getContext(), (int) C0906R.string.bi4).a();
            this.f62684e.getEditableText().delete(i5, i5 + 1);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (!StringUtils.isEmpty(this.o)) {
                g();
            }
            this.i.setVisibility(8);
            return;
        }
        this.i.setVisibility(0);
    }
}

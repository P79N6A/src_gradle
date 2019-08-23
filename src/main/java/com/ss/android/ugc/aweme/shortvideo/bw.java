package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.Lists;
import com.bytedance.ies.dmt.ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.port.in.q;
import com.ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;
import com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.ss.android.ugc.aweme.video.hashtag.HashTagListAdapter;
import com.ss.android.ugc.aweme.video.hashtag.b;
import com.ss.android.ugc.aweme.video.hashtag.d;
import com.ss.android.ugc.aweme.video.hashtag.e;
import com.ss.android.ugc.aweme.video.hashtag.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class bw implements c<c>, q.d, f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65841a = null;

    /* renamed from: b  reason: collision with root package name */
    public static String f65842b = "video_challenge";

    /* renamed from: c  reason: collision with root package name */
    public static String f65843c = "photo_publish";

    /* renamed from: d  reason: collision with root package name */
    public String f65844d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f65845e;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView f65846f;
    private ViewGroup g;
    private DmtStatusView h;
    private gy i;
    private q.c j;
    private q.b k;
    private q.a l;
    private HashTagListAdapter m;
    private ArrayList<b> n = new ArrayList<>();
    private String o = f65842b;

    public final void b(Exception exc) {
    }

    public final void b(List<c> list, boolean z) {
    }

    public final void c(Exception exc) {
    }

    public final void c(List<c> list, boolean z) {
    }

    public final void d(Exception exc) {
    }

    public final void n_() {
    }

    public final void s_() {
    }

    public final void z_() {
    }

    public final void a(Fragment fragment, boolean z, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{fragment, (byte) 1, str2}, this, f65841a, false, 74144, new Class[]{Fragment.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment, (byte) 1, str2}, this, f65841a, false, 74144, new Class[]{Fragment.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.o = str2;
        a(fragment);
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f65841a, false, 74152, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f65841a, false, 74152, new Class[]{String.class}, Void.TYPE);
        } else if (!a.x.a()) {
            this.g.setVisibility(0);
            if (TextUtils.isEmpty(str)) {
                this.l.a(1);
                return;
            }
            this.k.a(str, this.o);
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f65841a, false, 74154, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f65841a, false, 74154, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.h.setVisibility(0);
        this.f65846f.setVisibility(8);
        this.h.f();
    }

    public final void a(AVSearchChallengeList aVSearchChallengeList) {
        if (PatchProxy.isSupport(new Object[]{aVSearchChallengeList}, this, f65841a, false, 74155, new Class[]{AVSearchChallengeList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVSearchChallengeList}, this, f65841a, false, 74155, new Class[]{AVSearchChallengeList.class}, Void.TYPE);
            return;
        }
        List<h> list = aVSearchChallengeList == null ? null : aVSearchChallengeList.items;
        this.n.clear();
        if (Lists.isEmpty(list) || (aVSearchChallengeList.isDisabled && !com.ss.android.g.a.a())) {
            this.h.setVisibility(0);
            this.f65846f.setVisibility(8);
            this.h.e();
        } else {
            for (h hVar : list) {
                b bVar = new b();
                bVar.f76103b = 2;
                bVar.f76102a = hVar.f68037a;
                this.n.add(bVar);
            }
            this.h.b();
            this.h.setVisibility(8);
            this.f65846f.setVisibility(0);
        }
        this.m.notifyDataSetChanged();
    }

    public final void a(List<c> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f65841a, false, 74157, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f65841a, false, 74157, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(list);
    }

    public final void a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f65841a, false, 74158, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f65841a, false, 74158, new Class[]{c.class}, Void.TYPE);
            return;
        }
        f();
        this.f65845e = false;
        HashTagMentionEditText hashTagMentionEditText = this.i.f68019c;
        int selectionStart = hashTagMentionEditText.getSelectionStart();
        String substring = hashTagMentionEditText.getText().toString().substring(0, selectionStart);
        if (d.a(substring, com.ss.android.g.a.a()) || substring.endsWith("#")) {
            com.ss.android.ugc.aweme.video.hashtag.a b2 = d.b(substring, cVar.getChallengeName());
            hashTagMentionEditText.getText().replace(substring.lastIndexOf("#"), selectionStart, b2.f76101d);
            hashTagMentionEditText.a(true);
            String trim = b2.f76101d.trim();
            if (!d.a(trim, com.ss.android.g.a.a())) {
                hashTagMentionEditText.l.add(trim);
            }
        }
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f65841a, false, 74148, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65841a, false, 74148, new Class[0], Void.TYPE);
            return;
        }
        this.l = a.f61122e.a((c<c>) this);
        this.k = a.f61122e.a((q.d) this);
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f65841a, false, 74150, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65841a, false, 74150, new Class[0], Void.TYPE);
            return;
        }
        final HashTagMentionEditText hashTagMentionEditText = this.i.f68019c;
        hashTagMentionEditText.addTextChangedListener(new TextWatcher() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65847a;

            public final void afterTextChanged(Editable editable) {
                if (PatchProxy.isSupport(new Object[]{editable}, this, f65847a, false, 74164, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f65847a, false, 74164, new Class[]{Editable.class}, Void.TYPE);
                } else if (!bw.this.f65845e) {
                    bw.this.f();
                } else if (bw.this.f65844d.endsWith("#")) {
                    bw.this.a("");
                } else {
                    bw.this.a(bw.this.f65844d.substring(bw.this.f65844d.lastIndexOf(35) + 1, bw.this.f65844d.length()));
                }
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                int i4 = i;
                if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f65847a, false, 74162, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f65847a, false, 74162, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else if (i3 <= 0) {
                    ArrayList<TextExtraStruct> starAtlasExtraList = hashTagMentionEditText.getStarAtlasExtraList();
                    if (starAtlasExtraList != null) {
                        Iterator<TextExtraStruct> it2 = starAtlasExtraList.iterator();
                        while (it2.hasNext()) {
                            if (i4 == it2.next().getEnd() && hashTagMentionEditText.getText() != null) {
                                hashTagMentionEditText.getText().insert(i4, " ");
                            }
                        }
                    }
                }
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f65847a, false, 74163, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f65847a, false, 74163, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                bw.this.f65844d = hashTagMentionEditText.getText().toString().substring(0, hashTagMentionEditText.getSelectionStart());
                if (d.a(bw.this.f65844d, com.ss.android.g.a.a())) {
                    bw.this.f65845e = true;
                } else if (bw.this.f65844d.endsWith("#")) {
                    bw.this.f65845e = true;
                } else {
                    bw.this.f65845e = false;
                    bw.this.f();
                }
            }
        });
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f65841a, false, 74151, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65841a, false, 74151, new Class[0], Void.TYPE);
            return;
        }
        this.g.setVisibility(8);
        this.n.clear();
        this.m.notifyDataSetChanged();
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f65841a, false, 74156, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65841a, false, 74156, new Class[0], Void.TYPE);
            return;
        }
        a((List<c>) null);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f65841a, false, 74153, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65841a, false, 74153, new Class[0], Void.TYPE);
            return;
        }
        this.h.setVisibility(0);
        this.f65846f.setVisibility(8);
        this.h.d();
    }

    private void b(Fragment fragment) {
        if (PatchProxy.isSupport(new Object[]{fragment}, this, f65841a, false, 74149, new Class[]{Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment}, this, f65841a, false, 74149, new Class[]{Fragment.class}, Void.TYPE);
            return;
        }
        this.j = a.f61122e.a(fragment);
        this.j.b();
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f65841a, false, 74147, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f65841a, false, 74147, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (this.f65846f != null) {
            this.m = new HashTagListAdapter(context, this.n, this);
            this.f65846f.setLayoutManager(new LinearLayoutManager(context));
            this.f65846f.setAdapter(this.m);
        }
        if (this.h != null) {
            DmtDefaultView dmtDefaultView = new DmtDefaultView(context);
            dmtDefaultView.setStatus(new c.a(context).c(C0906R.string.bga).f20493a);
            dmtDefaultView.setOnClickListener(new bx(this));
            this.h.setBuilder(DmtStatusView.a.a(context).a((int) C0906R.string.bhw).c((View) dmtDefaultView));
        }
    }

    private void a(@NonNull Fragment fragment) {
        if (PatchProxy.isSupport(new Object[]{fragment}, this, f65841a, false, 74146, new Class[]{Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment}, this, f65841a, false, 74146, new Class[]{Fragment.class}, Void.TYPE);
            return;
        }
        a(fragment.getContext());
        g();
        this.i.a();
        h();
        b(fragment);
    }

    private void a(List<c> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f65841a, false, 74159, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f65841a, false, 74159, new Class[]{List.class}, Void.TYPE);
            return;
        }
        LinkedList<b> a2 = a(list, this.j.a());
        if (a2.isEmpty()) {
            this.h.setVisibility(0);
            this.f65846f.setVisibility(8);
            this.h.e();
            return;
        }
        this.h.setVisibility(8);
        this.f65846f.setVisibility(0);
        this.n.clear();
        this.n.addAll(a2);
        this.m.f76090d = true;
        this.m.notifyDataSetChanged();
    }

    private bw(@NonNull gy gyVar, @NonNull View view) {
        this.i = gyVar;
        this.f65846f = (RecyclerView) view.findViewById(C0906R.id.amn);
        this.g = (ViewGroup) view.findViewById(C0906R.id.amq);
        this.h = (DmtStatusView) view.findViewById(C0906R.id.cvd);
    }

    public static bw a(gy gyVar, View view) {
        gy gyVar2 = gyVar;
        View view2 = view;
        if (!PatchProxy.isSupport(new Object[]{gyVar2, view2}, null, f65841a, true, 74143, new Class[]{gy.class, View.class}, bw.class)) {
            return new bw(gyVar2, view2);
        }
        return (bw) PatchProxy.accessDispatch(new Object[]{gyVar2, view2}, null, f65841a, true, 74143, new Class[]{gy.class, View.class}, bw.class);
    }

    private LinkedList<b> a(List<c> list, List<g> list2) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{list, list2}, this, f65841a, false, 74160, new Class[]{List.class, List.class}, LinkedList.class)) {
            return (LinkedList) PatchProxy.accessDispatch(new Object[]{list, list2}, this, f65841a, false, 74160, new Class[]{List.class, List.class}, LinkedList.class);
        }
        LinkedList<b> linkedList = new LinkedList<>();
        if (list != null) {
            for (c next : list) {
                b bVar = new b();
                bVar.f76103b = 2;
                bVar.f76102a = next;
                bVar.f76104c = 2130839590;
                bVar.f76105d = true;
                if (list2 != null) {
                    z = false;
                    for (g gVar : list2) {
                        if (next.getChallengeName().equals(gVar.f67836c.getChallengeName())) {
                            z = true;
                        }
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    linkedList.add(bVar);
                }
            }
        }
        if (list2 != null) {
            for (g next2 : list2) {
                b bVar2 = new b();
                bVar2.f76103b = 2;
                bVar2.f76102a = next2.f67836c;
                bVar2.f76104c = e.a(next2.f67834a);
                bVar2.f76106e = next2.f67837d;
                if (next2.f67835b > linkedList.size()) {
                    linkedList.add(bVar2);
                } else if (next2.f67835b < 0) {
                    linkedList.add(0, bVar2);
                } else {
                    linkedList.add(next2.f67835b, bVar2);
                }
            }
        }
        return linkedList;
    }
}

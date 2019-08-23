package com.ss.android.ugc.aweme.shortvideo;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.common.a.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.imported.b;
import com.ss.android.ugc.aweme.imported.g;
import com.ss.android.ugc.aweme.imported.h;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.publish.PulishTitle;
import com.ss.android.ugc.aweme.shortvideo.edit.q;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.o.i;
import com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.ss.android.ugc.aweme.video.hashtag.a;
import com.ss.android.ugc.aweme.video.hashtag.d;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;
import com.tt.appbrandimpl.PublishExtra;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class gy {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68017a;

    /* renamed from: b  reason: collision with root package name */
    public final Fragment f68018b;

    /* renamed from: c  reason: collision with root package name */
    public final HashTagMentionEditText f68019c;

    /* renamed from: d  reason: collision with root package name */
    final View f68020d;

    /* renamed from: e  reason: collision with root package name */
    final View f68021e;

    /* renamed from: f  reason: collision with root package name */
    final int f68022f;
    final int g;
    public String h = "";
    final ArrayList<da> i = new ArrayList<>();
    private g j;

    public final void a(List<c> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f68017a, false, 74781, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f68017a, false, 74781, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (!CollectionUtils.isEmpty(list)) {
            this.f68019c.l.clear();
            for (c next : list) {
                if (next != null) {
                    String obj = this.f68019c.getText().toString();
                    if (!obj.contains("#" + next.getChallengeName() + " ")) {
                        Set set = this.f68019c.l;
                        set.add("#" + next.getChallengeName());
                        a b2 = d.b(this.f68019c.getText().toString(), next.getChallengeName());
                        if (b2.f76100c <= PulishTitle.MAX_WORDS) {
                            this.f68019c.getText().insert(b2.f76099b, b2.f76101d);
                        }
                        this.f68019c.a(true);
                    }
                }
            }
        }
    }

    public final void a(q qVar) {
        if (PatchProxy.isSupport(new Object[]{qVar}, this, f68017a, false, 74782, new Class[]{q.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{qVar}, this, f68017a, false, 74782, new Class[]{q.class}, Void.TYPE);
            return;
        }
        this.f68019c.l.clear();
        if (qVar != null && !TextUtils.isEmpty(qVar.getExtra())) {
            PublishExtra publishExtra = (PublishExtra) com.ss.android.ugc.aweme.port.in.a.f61120c.fromJson(qVar.getExtra(), PublishExtra.class);
            if (publishExtra != null && !CollectionUtils.isEmpty(publishExtra.getVideoTopics())) {
                for (String next : publishExtra.getVideoTopics()) {
                    Set set = this.f68019c.l;
                    set.add("#" + next);
                    a b2 = d.b(this.f68019c.getText().toString(), next);
                    if (b2.f76100c <= PulishTitle.MAX_WORDS) {
                        this.f68019c.getText().insert(b2.f76099b, b2.f76101d);
                    }
                    this.f68019c.a(true);
                }
            }
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f68017a, false, 74786, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f68017a, false, 74786, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f68019c.setText(str2);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f68017a, false, 74783, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68017a, false, 74783, new Class[0], Void.TYPE);
            return;
        }
        this.f68019c.e();
    }

    public final String c() {
        if (!PatchProxy.isSupport(new Object[0], this, f68017a, false, 74784, new Class[0], String.class)) {
            return this.f68019c.getText().toString();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f68017a, false, 74784, new Class[0], String.class);
    }

    public final List<AVTextExtraStruct> d() {
        if (!PatchProxy.isSupport(new Object[0], this, f68017a, false, 74785, new Class[0], List.class)) {
            return i.a(this.f68019c.getTextExtraStructListWithHashTag());
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, f68017a, false, 74785, new Class[0], List.class);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f68017a, false, 74780, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68017a, false, 74780, new Class[0], Void.TYPE);
            return;
        }
        this.j = new g();
        this.j.a((EditText) this.f68019c);
        if (this.f68020d != null) {
            if (com.ss.android.ugc.aweme.port.in.a.x.a()) {
                this.f68020d.setVisibility(8);
            } else {
                this.f68020d.setVisibility(0);
            }
        }
        this.f68019c.setMentionTextColor(ContextCompat.getColor(this.f68019c.getContext(), C0906R.color.zl));
        this.f68019c.setOnMentionInputListener(new MentionEditText.e() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f68023a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f68023a, false, 74798, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f68023a, false, 74798, new Class[0], Void.TYPE);
                } else if (!com.ss.android.ugc.aweme.port.in.a.x.a()) {
                    com.ss.android.ugc.aweme.port.in.a.f61123f.a(gy.this.f68018b, 3, "", gy.this.f68022f);
                }
            }
        });
        if (this.f68020d != null && !com.ss.android.ugc.aweme.port.in.a.x.a()) {
            this.f68020d.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f68025a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f68025a, false, 74799, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f68025a, false, 74799, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    KeyboardUtils.b(gy.this.f68019c);
                    Editable text = gy.this.f68019c.getText();
                    if (text.length() <= PulishTitle.MAX_WORDS) {
                        text.insert(Selection.getSelectionStart(text), "#");
                    }
                }
            });
        }
        if (this.f68021e != null) {
            this.f68021e.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f68027a;

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: org.json.JSONObject} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: org.json.JSONObject} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: org.json.JSONObject} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: android.os.Bundle} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: org.json.JSONObject} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: org.json.JSONObject} */
                /* JADX WARNING: type inference failed for: r1v7, types: [android.os.Bundle] */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onClick(android.view.View r14) {
                    /*
                        r13 = this;
                        r8 = 1
                        java.lang.Object[] r0 = new java.lang.Object[r8]
                        r9 = 0
                        r0[r9] = r14
                        com.meituan.robust.ChangeQuickRedirect r2 = f68027a
                        java.lang.Class[] r5 = new java.lang.Class[r8]
                        java.lang.Class<android.view.View> r1 = android.view.View.class
                        r5[r9] = r1
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r3 = 0
                        r4 = 74800(0x12430, float:1.04817E-40)
                        r1 = r13
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                        if (r0 == 0) goto L_0x0032
                        java.lang.Object[] r0 = new java.lang.Object[r8]
                        r0[r9] = r14
                        com.meituan.robust.ChangeQuickRedirect r2 = f68027a
                        r3 = 0
                        r4 = 74800(0x12430, float:1.04817E-40)
                        java.lang.Class[] r5 = new java.lang.Class[r8]
                        java.lang.Class<android.view.View> r1 = android.view.View.class
                        r5[r9] = r1
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r1 = r13
                        com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                        return
                    L_0x0032:
                        com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r14)
                        com.ss.android.ugc.aweme.account.f r0 = com.ss.android.ugc.aweme.port.in.a.x
                        boolean r0 = r0.c()
                        r1 = 0
                        if (r0 != 0) goto L_0x006d
                        com.ss.android.ugc.aweme.shortvideo.gy r0 = com.ss.android.ugc.aweme.shortvideo.gy.this
                        android.support.v4.app.Fragment r0 = r0.f68018b
                        r2 = 2131561793(0x7f0d0d41, float:1.8748997E38)
                        java.lang.String r0 = r0.getString(r2)
                        com.ss.android.ugc.aweme.account.f r7 = com.ss.android.ugc.aweme.port.in.a.x
                        com.ss.android.ugc.aweme.shortvideo.gy r2 = com.ss.android.ugc.aweme.shortvideo.gy.this
                        android.support.v4.app.Fragment r8 = r2.f68018b
                        java.lang.String r9 = ""
                        java.lang.String r10 = "click_at_friend"
                        boolean r2 = com.ss.android.ugc.aweme.i18n.c.a()
                        if (r2 == 0) goto L_0x005b
                    L_0x0059:
                        r11 = r1
                        goto L_0x0068
                    L_0x005b:
                        com.ss.android.ugc.aweme.utils.ad r1 = com.ss.android.ugc.aweme.utils.ad.a()
                        java.lang.String r2 = "login_title"
                        com.ss.android.ugc.aweme.utils.ad r0 = r1.a((java.lang.String) r2, (java.lang.String) r0)
                        android.os.Bundle r1 = r0.f75487b
                        goto L_0x0059
                    L_0x0068:
                        r12 = 0
                        r7.a((android.support.v4.app.Fragment) r8, (java.lang.String) r9, (java.lang.String) r10, (android.os.Bundle) r11, (com.ss.android.ugc.aweme.account.f.a) r12)
                        return
                    L_0x006d:
                        com.ss.android.ugc.aweme.port.in.al r0 = com.ss.android.ugc.aweme.port.in.a.f61123f
                        com.ss.android.ugc.aweme.shortvideo.gy r2 = com.ss.android.ugc.aweme.shortvideo.gy.this
                        android.support.v4.app.Fragment r2 = r2.f68018b
                        r3 = 3
                        r0.a(r2, r3)
                        com.ss.android.ugc.aweme.shortvideo.gy r0 = com.ss.android.ugc.aweme.shortvideo.gy.this
                        int r0 = r0.g
                        if (r0 == 0) goto L_0x008e
                        com.ss.android.ugc.aweme.common.t r0 = new com.ss.android.ugc.aweme.common.t
                        r0.<init>()
                        java.lang.String r1 = "is_photo"
                        java.lang.String r2 = "1"
                        com.ss.android.ugc.aweme.common.t r0 = r0.a(r1, r2)
                        org.json.JSONObject r1 = r0.a()
                    L_0x008e:
                        com.ss.android.ugc.aweme.common.MobClick r0 = com.ss.android.ugc.aweme.common.MobClick.obtain()
                        java.lang.String r2 = "notify_friend"
                        com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r2)
                        java.lang.String r2 = "edit_page"
                        com.ss.android.ugc.aweme.common.MobClick r0 = r0.setLabelName(r2)
                        com.ss.android.ugc.aweme.common.MobClick r0 = r0.setJsonObject(r1)
                        com.ss.android.ugc.aweme.common.r.onEvent(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.gy.AnonymousClass3.onClick(android.view.View):void");
                }
            });
        }
        this.f68019c.setFilters(new InputFilter[]{new b(PulishTitle.MAX_WORDS)});
        this.f68019c.addTextChangedListener(new TextWatcher() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f68029a;

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                Editable editable2 = editable;
                if (PatchProxy.isSupport(new Object[]{editable2}, this, f68029a, false, 74801, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable2}, this, f68029a, false, 74801, new Class[]{Editable.class}, Void.TYPE);
                    return;
                }
                int length = editable.length();
                if (length > 0) {
                    int i = length - 1;
                    if (editable2.charAt(i) == 10) {
                        editable2.delete(i, length);
                    }
                }
                gy gyVar = gy.this;
                if (PatchProxy.isSupport(new Object[0], gyVar, gy.f68017a, false, 74794, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], gyVar, gy.f68017a, false, 74794, new Class[0], Void.TYPE);
                } else {
                    for (int i2 = 0; i2 < gyVar.i.size(); i2++) {
                        gyVar.i.get(i2).e();
                    }
                }
                Editable text = gy.this.f68019c.getText();
                if (text.length() > PulishTitle.MAX_WORDS) {
                    int selectionEnd = Selection.getSelectionEnd(text);
                    gy.this.f68019c.setText(text.toString().substring(0, PulishTitle.MAX_WORDS));
                    Editable text2 = gy.this.f68019c.getText();
                    if (selectionEnd > text2.length()) {
                        selectionEnd = text2.length();
                    }
                    Selection.setSelection(text2, selectionEnd);
                    com.bytedance.ies.dmt.ui.d.a.c(gy.this.f68018b.getContext(), (int) C0906R.string.du5).a();
                }
            }
        });
    }

    public final void a(da daVar) {
        if (PatchProxy.isSupport(new Object[]{daVar}, this, f68017a, false, 74790, new Class[]{da.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{daVar}, this, f68017a, false, 74790, new Class[]{da.class}, Void.TYPE);
            return;
        }
        this.i.add(m.a(daVar));
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f68017a, false, 74795, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f68017a, false, 74795, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.j.a(str2);
    }

    public final void b(List<AVTextExtraStruct> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f68017a, false, 74787, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f68017a, false, 74787, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f68019c.setAVTextExtraList(list);
        if (!Lists.isEmpty(list)) {
            Iterator<AVTextExtraStruct> it2 = list.iterator();
            while (it2.hasNext()) {
                String trim = ("#" + it2.next().getHashTagName()).trim();
                if (!d.a(trim, com.ss.android.g.a.a())) {
                    this.f68019c.l.add(trim);
                }
            }
        }
    }

    public final void a(Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2}, this, f68017a, false, 74792, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2}, this, f68017a, false, 74792, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        User a2 = com.ss.android.ugc.aweme.port.in.a.f61123f.a(intent2);
        if (a2 != null) {
            this.f68019c.a(0, h.a(a2), a2.getUid());
        }
    }

    public static AVTextExtraStruct a(int i2, int i3, String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str2}, null, f68017a, true, 74797, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, AVTextExtraStruct.class)) {
            return a(i2, i3, str2, "");
        }
        return (AVTextExtraStruct) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str2}, null, f68017a, true, 74797, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, AVTextExtraStruct.class);
    }

    public static AVTextExtraStruct a(int i2, int i3, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str3, str4}, null, f68017a, true, 74796, new Class[]{Integer.TYPE, Integer.TYPE, String.class, String.class}, AVTextExtraStruct.class)) {
            return (AVTextExtraStruct) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str3, str4}, null, f68017a, true, 74796, new Class[]{Integer.TYPE, Integer.TYPE, String.class, String.class}, AVTextExtraStruct.class);
        }
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.setAtUserType("");
        aVTextExtraStruct.setType(0);
        aVTextExtraStruct.setStart(i2);
        aVTextExtraStruct.setEnd(i3);
        aVTextExtraStruct.setUserId(str3);
        aVTextExtraStruct.setAwemeId(str4);
        return aVTextExtraStruct;
    }

    public static gy a(Fragment fragment, @NonNull HashTagMentionEditText hashTagMentionEditText, @Nullable View view, @Nullable View view2, int i2) {
        if (PatchProxy.isSupport(new Object[]{fragment, hashTagMentionEditText, view, view2, 0}, null, f68017a, true, 74778, new Class[]{Fragment.class, HashTagMentionEditText.class, View.class, View.class, Integer.TYPE}, gy.class)) {
            return (gy) PatchProxy.accessDispatch(new Object[]{fragment, hashTagMentionEditText, view, view2, 0}, null, f68017a, true, 74778, new Class[]{Fragment.class, HashTagMentionEditText.class, View.class, View.class, Integer.TYPE}, gy.class);
        }
        gy gyVar = new gy(fragment, hashTagMentionEditText, view, view2, 0, 0);
        return gyVar;
    }

    public gy(Fragment fragment, HashTagMentionEditText hashTagMentionEditText, View view, View view2, int i2, int i3) {
        this.f68018b = fragment;
        this.f68019c = hashTagMentionEditText;
        this.f68020d = view;
        this.f68021e = view2;
        this.f68022f = i2;
        this.g = i3;
    }
}

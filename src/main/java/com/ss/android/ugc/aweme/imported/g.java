package com.ss.android.ugc.aweme.imported;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52917a;

    /* renamed from: b  reason: collision with root package name */
    List<String> f52918b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    String f52919c;

    /* renamed from: d  reason: collision with root package name */
    boolean f52920d = true;

    /* renamed from: e  reason: collision with root package name */
    private Gson f52921e = a.f61120c;

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f52917a, false, 54471, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52917a, false, 54471, new Class[0], Void.TYPE);
            return;
        }
        this.f52919c = null;
        this.f52918b.clear();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f52917a, false, 54470, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52917a, false, 54470, new Class[0], Void.TYPE);
            return;
        }
        this.f52920d = false;
        b();
    }

    public final void a(EditText editText) {
        EditText editText2 = editText;
        if (PatchProxy.isSupport(new Object[]{editText2}, this, f52917a, false, 54467, new Class[]{EditText.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{editText2}, this, f52917a, false, 54467, new Class[]{EditText.class}, Void.TYPE);
        } else if (editText2 != null) {
            editText2.addTextChangedListener(new TextWatcher() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52922a;

                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void afterTextChanged(Editable editable) {
                    if (PatchProxy.isSupport(new Object[]{editable}, this, f52922a, false, 54472, new Class[]{Editable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{editable}, this, f52922a, false, 54472, new Class[]{Editable.class}, Void.TYPE);
                        return;
                    }
                    g gVar = g.this;
                    String obj = editable.toString();
                    if (PatchProxy.isSupport(new Object[]{obj}, gVar, g.f52917a, false, 54468, new Class[]{String.class}, Void.TYPE)) {
                        g gVar2 = gVar;
                        PatchProxy.accessDispatch(new Object[]{obj}, gVar2, g.f52917a, false, 54468, new Class[]{String.class}, Void.TYPE);
                    } else if (TextUtils.isEmpty(obj)) {
                        gVar.f52920d = true;
                    } else {
                        if (gVar.f52920d) {
                            if (TextUtils.isEmpty(gVar.f52919c)) {
                                gVar.f52918b.add(obj);
                                gVar.f52919c = obj;
                                return;
                            }
                            int length = gVar.f52919c.length();
                            int length2 = obj.length();
                            if (length != length2) {
                                if (length > length2) {
                                    gVar.a();
                                } else if (!obj.startsWith(gVar.f52919c)) {
                                    gVar.a();
                                } else {
                                    gVar.f52918b.add(obj.substring(length));
                                    gVar.f52919c = obj;
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f52917a, false, 54469, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f52917a, false, 54469, new Class[]{String.class}, Void.TYPE);
        } else if (!this.f52918b.isEmpty() && this.f52920d) {
            r.a("input_word_cut", (Map) d.a().a("enter_from", str).a("input_content", this.f52919c).a("input_content_cut", this.f52921e.toJson((Object) this.f52918b)).f34114b);
            a();
        }
    }
}

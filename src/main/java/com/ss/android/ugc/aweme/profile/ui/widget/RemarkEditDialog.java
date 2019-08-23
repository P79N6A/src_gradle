package com.ss.android.ugc.aweme.profile.ui.widget;

import a.i;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.c;
import com.ss.android.ugc.aweme.profile.model.CommitRemarkNameResponse;
import com.ss.android.ugc.aweme.profile.model.User;

public class RemarkEditDialog extends AppCompatDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63090a;

    /* renamed from: b  reason: collision with root package name */
    public Context f63091b;

    /* renamed from: c  reason: collision with root package name */
    public EditText f63092c;

    /* renamed from: d  reason: collision with root package name */
    public Button f63093d;

    /* renamed from: e  reason: collision with root package name */
    public ImageButton f63094e;

    /* renamed from: f  reason: collision with root package name */
    public a f63095f;
    public User g;
    public String h = "";
    public int i;
    private View j;
    private DmtTextView k;
    private DmtTextView l;
    private Button m;

    public interface a {
        void a();
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63090a, false, 69856, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63090a, false, 69856, new Class[0], Void.TYPE);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f63092c.getWindowToken(), 0);
        }
    }

    public void cancel() {
        if (PatchProxy.isSupport(new Object[0], this, f63090a, false, 69854, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63090a, false, 69854, new Class[0], Void.TYPE);
            return;
        }
        a();
        super.cancel();
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f63090a, false, 69853, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63090a, false, 69853, new Class[0], Void.TYPE);
            return;
        }
        a();
        super.dismiss();
    }

    public RemarkEditDialog(Context context) {
        super(context);
        this.f63091b = context;
    }

    public void onCreate(Bundle bundle) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f63090a, false, 69852, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f63090a, false, 69852, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setLayout(-1, -2);
        this.j = LayoutInflater.from(this.f63091b).inflate(C0906R.layout.k_, null);
        setContentView(this.j);
        this.k = (DmtTextView) this.j.findViewById(C0906R.id.dhd);
        this.f63092c = (EditText) this.j.findViewById(C0906R.id.aag);
        this.l = (DmtTextView) this.j.findViewById(C0906R.id.dhc);
        this.m = (Button) this.j.findViewById(C0906R.id.cd5);
        this.f63093d = (Button) this.j.findViewById(C0906R.id.cd6);
        this.f63094e = (ImageButton) this.j.findViewById(C0906R.id.ns);
        this.m.setOnClickListener(new k(this));
        if (this.i == 1) {
            this.k.setText(C0906R.string.a_u);
            this.l.setText(C0906R.string.a_s);
            this.l.setVisibility(0);
        } else {
            this.k.setText(C0906R.string.a_t);
            this.l.setVisibility(8);
        }
        if (this.g != null && TextUtils.isEmpty(this.h)) {
            if (!TextUtils.isEmpty(this.g.getRemarkName())) {
                this.h = this.g.getRemarkName();
            } else {
                this.h = this.g.getNickname();
            }
        }
        this.f63092c.setText(this.h);
        this.f63092c.setSelection(this.f63092c.getText().length());
        this.f63093d.setOnClickListener(new l(this));
        this.f63092c.addTextChangedListener(new c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63096a;

            public final void afterTextChanged(Editable editable) {
                String str;
                String str2;
                if (PatchProxy.isSupport(new Object[]{editable}, this, f63096a, false, 69864, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f63096a, false, 69864, new Class[]{Editable.class}, Void.TYPE);
                    return;
                }
                if (Character.codePointCount(editable, 0, editable.length()) > 20) {
                    com.bytedance.ies.dmt.ui.d.a.b(RemarkEditDialog.this.f63091b, RemarkEditDialog.this.f63091b.getString(C0906R.string.lw)).a();
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    String obj = editable.toString();
                    if (selectionEnd == 0) {
                        str = "";
                    } else {
                        str = obj.substring(0, selectionEnd);
                    }
                    if (selectionEnd == obj.length()) {
                        str2 = "";
                    } else {
                        str2 = obj.substring(selectionEnd);
                    }
                    int codePointCount = Character.codePointCount(str2, 0, str2.length());
                    StringBuilder sb = new StringBuilder();
                    int i = 20 - codePointCount;
                    for (int i2 = 0; i2 < i; i2++) {
                        sb.append(Character.toChars(Character.codePointAt(str, sb.length())));
                    }
                    sb.append(str2);
                    RemarkEditDialog.this.f63092c.setText(sb.toString());
                    Selection.setSelection(RemarkEditDialog.this.f63092c.getText(), Math.min(RemarkEditDialog.this.f63092c.length() - str2.length(), RemarkEditDialog.this.f63092c.length()));
                }
                if (TextUtils.isEmpty(editable)) {
                    RemarkEditDialog.this.f63094e.setVisibility(4);
                } else {
                    RemarkEditDialog.this.f63094e.setVisibility(0);
                }
                if (RemarkEditDialog.this.i == 1) {
                    if (editable.toString().trim().length() > 0) {
                        RemarkEditDialog.this.f63093d.setEnabled(true);
                        RemarkEditDialog.this.f63093d.setAlpha(1.0f);
                        return;
                    }
                    RemarkEditDialog.this.f63093d.setEnabled(false);
                    RemarkEditDialog.this.f63093d.setAlpha(0.34f);
                }
            }
        });
        ImageButton imageButton = this.f63094e;
        if (this.f63092c.getText().length() <= 0) {
            i2 = 4;
        }
        imageButton.setVisibility(i2);
        this.f63094e.setOnClickListener(new m(this));
        setOnShowListener(new n(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(String str, i iVar) throws Exception {
        if (iVar.d() || iVar.c()) {
            com.bytedance.ies.dmt.ui.d.a.b(this.f63091b, (int) C0906R.string.c16).a();
        } else {
            CommitRemarkNameResponse commitRemarkNameResponse = (CommitRemarkNameResponse) iVar.e();
            if (commitRemarkNameResponse.isOK()) {
                this.g.setRemarkName(str);
                if (this.f63095f != null) {
                    this.f63095f.a();
                }
            } else if (commitRemarkNameResponse.statusCode == 2550) {
                com.bytedance.ies.dmt.ui.d.a.b(this.f63091b, (int) C0906R.string.byy).a();
            } else {
                com.bytedance.ies.dmt.ui.d.a.b(this.f63091b, commitRemarkNameResponse.statusMsg).a();
            }
        }
        return null;
    }
}

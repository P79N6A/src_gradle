package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.input.emoji.g;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.e;
import com.ss.android.ugc.aweme.im.sdk.chat.k;
import com.ss.android.ugc.aweme.im.sdk.chat.l;
import com.ss.android.ugc.aweme.im.sdk.chat.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.d.a;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.utils.bc;
import com.ss.android.ugc.aweme.im.sdk.utils.m;

public class TextViewHolder extends BaseViewHolder<TextContent> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f51155b;

    /* renamed from: a  reason: collision with root package name */
    private TextView f51156a;

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f51155b, false, 51655, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51155b, false, 51655, new Class[0], Void.TYPE);
            return;
        }
        super.c();
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51155b, false, 51656, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51155b, false, 51656, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.f51156a = (TextView) a((int) C0906R.id.bnw);
        this.i = (View) a((int) C0906R.id.yp);
        if (this.i != null) {
            Drawable background = this.i.getBackground();
            if (background != null && Build.VERSION.SDK_INT >= 19) {
                background.setAutoMirrored(true);
            }
        }
    }

    public TextViewHolder(View view, int i) {
        super(view);
    }

    public void a(n nVar, n nVar2, TextContent textContent, int i) {
        int i2;
        n nVar3 = nVar;
        TextContent textContent2 = textContent;
        if (PatchProxy.isSupport(new Object[]{nVar3, nVar2, textContent2, Integer.valueOf(i)}, this, f51155b, false, 51657, new Class[]{n.class, n.class, TextContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar3, nVar2, textContent2, Integer.valueOf(i)}, this, f51155b, false, 51657, new Class[]{n.class, n.class, TextContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, textContent, i);
        if (textContent2 != null && textContent.getText() != null) {
            long length = (long) textContent.getText().length();
            if (a.a().e().getIMSetting().f52879b != 1 || length > 1024) {
                this.f51156a.setText(textContent.getText());
            } else {
                TextView textView = this.f51156a;
                String text = textContent.getText();
                String str = this.h;
                e.a(textView, text, str, textContent2.isCard, nVar.getMsgId());
            }
            if (length <= 1024) {
                g.a(this.f51156a);
            }
            if (textContent.isDefault()) {
                if (m.b()) {
                    i2 = GlobalContext.getContext().getResources().getColor(C0906R.color.ak0);
                } else if (nVar.isSelf()) {
                    i2 = GlobalContext.getContext().getResources().getColor(C0906R.color.ajn);
                } else {
                    i2 = GlobalContext.getContext().getResources().getColor(C0906R.color.ami);
                }
                if (!ad.e(nVar)) {
                    TextView textView2 = this.f51156a;
                    String text2 = textContent.getText();
                    Object[] objArr = {textView2, text2, Integer.valueOf(i2)};
                    if (PatchProxy.isSupport(objArr, null, k.f50675a, true, 50418, new Class[]{TextView.class, String.class, Integer.TYPE}, Void.TYPE)) {
                        Object[] objArr2 = {textView2, text2, Integer.valueOf(i2)};
                        Object[] objArr3 = objArr2;
                        PatchProxy.accessDispatch(objArr3, null, k.f50675a, true, 50418, new Class[]{TextView.class, String.class, Integer.TYPE}, Void.TYPE);
                    } else if (TextUtils.isEmpty(text2)) {
                        textView2.setText("");
                    } else {
                        SpannableString spannableString = new SpannableString(text2);
                        String string = GlobalContext.getContext().getString(C0906R.string.aqy);
                        if (text2.contains(string)) {
                            k.e eVar = new k.e(i2);
                            int indexOf = text2.indexOf(string);
                            l.a(spannableString, eVar, indexOf, string.length() + indexOf, 33);
                        }
                        textView2.setText(spannableString);
                    }
                } else if (bc.b()) {
                    int color = GlobalContext.getContext().getResources().getColor(C0906R.color.qg);
                    String string2 = GlobalContext.getContext().getString(C0906R.string.azs);
                    Context context = this.itemView.getContext();
                    TextView textView3 = this.f51156a;
                    String text3 = textContent.getText();
                    Object[] objArr4 = {context, textView3, text3, string2, Integer.valueOf(color), nVar3};
                    if (PatchProxy.isSupport(objArr4, null, k.f50675a, true, 50419, new Class[]{Context.class, TextView.class, String.class, String.class, Integer.TYPE, n.class}, Void.TYPE)) {
                        Object[] objArr5 = {context, textView3, text3, string2, Integer.valueOf(color), nVar3};
                        Object[] objArr6 = objArr5;
                        PatchProxy.accessDispatch(objArr6, null, k.f50675a, true, 50419, new Class[]{Context.class, TextView.class, String.class, String.class, Integer.TYPE, n.class}, Void.TYPE);
                    } else {
                        SpannableString spannableString2 = new SpannableString(text3);
                        if (text3.contains(string2)) {
                            k.d dVar = new k.d(context, color, nVar3, (byte) 0);
                            int indexOf2 = text3.indexOf(string2);
                            l.a(spannableString2, dVar, indexOf2, string2.length() + indexOf2, 33);
                        }
                        textView3.setText(spannableString2);
                        textView3.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                } else {
                    this.f51156a.setText(textContent.getText());
                }
            }
            if (nVar.isRecalled()) {
                this.f51156a.setTextColor(GlobalContext.getContext().getResources().getColor(C0906R.color.qj));
                this.i.setEnabled(false);
            } else {
                this.f51156a.setTextColor(GlobalContext.getContext().getResources().getColor(C0906R.color.qi));
                this.i.setEnabled(true);
            }
            if (textContent.getHeartType() == 2 || textContent.getHeartType() == 1) {
                this.i.setTag(50331648, 31);
            } else {
                this.i.setTag(50331648, 1);
            }
            this.i.setTag(50331649, Boolean.valueOf(textContent2.isCard));
        }
    }
}

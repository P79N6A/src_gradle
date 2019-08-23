package com.ss.android.ugc.aweme.story.feed.view.ui.comment;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.story.api.model.b;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange;
import com.ss.android.ugc.aweme.story.metrics.h;
import java.util.Map;

public class StoryReplyDialog extends KeyboardAwareDialog implements DialogInterface.OnShowListener {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f72871b;

    /* renamed from: c  reason: collision with root package name */
    public KeyboardAwareEditText f72872c;

    /* renamed from: d  reason: collision with root package name */
    CommentEditTextWrapper f72873d;

    /* renamed from: e  reason: collision with root package name */
    String f72874e = "";

    /* renamed from: f  reason: collision with root package name */
    b f72875f;
    public a g;
    private LinearLayout h;
    private LinearLayout i;
    private boolean j;
    private TextWatcher k;

    public interface a {
        void a(boolean z);
    }

    public final KeyboardAwareEditText c() {
        return this.f72872c;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f72871b, false, 84208, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72871b, false, 84208, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.i.setAlpha(0.0f);
        dismissAllowingStateLoss();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f72871b, false, 84207, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72871b, false, 84207, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        this.i.setAlpha(1.0f);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f72871b, false, 84215, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72871b, false, 84215, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.common.ui.b.a((Activity) getActivity(), (View) this.f72872c);
        dismissAllowingStateLoss();
        if (this.g != null) {
            this.g.a(false);
        }
    }

    public void dismissAllowingStateLoss() {
        if (PatchProxy.isSupport(new Object[0], this, f72871b, false, 84214, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72871b, false, 84214, new Class[0], Void.TYPE);
            return;
        }
        super.dismissAllowingStateLoss();
        if (this.g != null) {
            this.g.a(false);
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f72871b, false, 84209, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72871b, false, 84209, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        dismissAllowingStateLoss();
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f72871b, false, 84212, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72871b, false, 84212, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        dismissAllowingStateLoss();
    }

    public final void a(TextWatcher textWatcher) {
        this.k = textWatcher;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f72871b, false, 84213, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f72871b, false, 84213, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        super.onDismiss(dialogInterface);
        if (this.g != null) {
            this.g.a(false);
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f72871b, false, 84196, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f72871b, false, 84196, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(1, C0906R.style.so);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f72874e = arguments.getString("key_content");
            this.j = arguments.getBoolean("key_is_from_wipe_up");
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f72871b, false, 84197, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f72871b, false, 84197, new Class[]{Bundle.class}, Dialog.class);
        }
        AnonymousClass1 r0 = new i(getActivity(), getTheme()) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72876a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f72876a, false, 84218, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f72876a, false, 84218, new Class[0], Void.TYPE);
                    return;
                }
                if (StoryReplyDialog.this.f72872c != null) {
                    com.ss.android.ugc.aweme.common.ui.b.a((Activity) StoryReplyDialog.this.getActivity(), (View) StoryReplyDialog.this.f72872c);
                }
            }
        };
        r0.setCanceledOnTouchOutside(true);
        r0.setCancelable(true);
        r0.setOnShowListener(this);
        return r0;
    }

    public final void a(boolean z) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72871b, false, 84206, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72871b, false, 84206, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        h hVar = new h();
        hVar.f73182b = "homepage_story";
        if (this.j) {
            str = "slide_up";
        } else {
            str = "click_message";
        }
        hVar.f73183c = str;
        if (z) {
            str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str2 = PushConstants.PUSH_TYPE_NOTIFY;
        }
        hVar.f73185e = str2;
        hVar.f73184d = this.f72875f.getLifeStory().getAuthor().getUid();
        hVar.f73186f = this.f72875f.getLogPb();
        hVar.post();
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f72871b, false, 84199, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f72871b, false, 84199, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        if (PatchProxy.isSupport(new Object[0], this, f72871b, false, 84198, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72871b, false, 84198, new Class[0], Void.TYPE);
            return;
        }
        Window window = getDialog().getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = getDialog().getWindow().getAttributes();
            attributes.flags |= 2;
            attributes.height = -2;
            attributes.width = -1;
            attributes.gravity = 80;
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setAttributes(attributes);
            window.setDimAmount(0.5f);
            window.setSoftInputMode(16);
        }
    }

    public void onShow(DialogInterface dialogInterface) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f72871b, false, 84210, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f72871b, false, 84210, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.story.base.b.a a2 = new com.ss.android.ugc.aweme.story.base.b.a().a("enter_from", "homepage_story");
        if (PatchProxy.isSupport(new Object[0], this, f72871b, false, 84211, new Class[0], String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[0], this, f72871b, false, 84211, new Class[0], String.class);
        } else {
            str = g.a(this.f72875f);
            if (TextUtils.isEmpty(str) && getActivity() != null) {
                str = g.a(StoryChange.c(getActivity()));
            }
        }
        com.ss.android.ugc.aweme.story.base.b.a a3 = a2.a("to_user_id", str);
        if (this.j) {
            str2 = "slide_up";
        } else {
            str2 = "click_message";
        }
        r.a("enter_chat", (Map) a3.a("enter_method", str2).f71925b);
        if (this.g != null) {
            this.g.a(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f72871b
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 84201(0x148e9, float:1.17991E-40)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f72871b
            r3 = 0
            r4 = 84201(0x148e9, float:1.17991E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            r0 = 2131168398(0x7f070c8e, float:1.7951097E38)
            android.view.View r0 = r11.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r10.h = r0
            r0 = 2131167357(0x7f07087d, float:1.7948985E38)
            android.view.View r0 = r11.findViewById(r0)
            com.ss.android.ugc.aweme.story.feed.view.ui.comment.KeyboardAwareEditText r0 = (com.ss.android.ugc.aweme.story.feed.view.ui.comment.KeyboardAwareEditText) r0
            r10.f72872c = r0
            r0 = 2131167351(0x7f070877, float:1.7948973E38)
            android.view.View r0 = r11.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r10.i = r0
            r0 = 2131166024(0x7f070348, float:1.7946282E38)
            android.view.View r0 = r11.findViewById(r0)
            com.ss.android.ugc.aweme.story.feed.view.ui.comment.CommentEditTextWrapper r0 = (com.ss.android.ugc.aweme.story.feed.view.ui.comment.CommentEditTextWrapper) r0
            r10.f72873d = r0
            android.widget.LinearLayout r0 = r10.i
            r1 = 953267991(0x38d1b717, float:1.0E-4)
            r0.setAlpha(r1)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f72871b
            r3 = 0
            r4 = 84203(0x148eb, float:1.17994E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0091
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f72871b
            r3 = 0
            r4 = 84203(0x148eb, float:1.17994E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            goto L_0x00a8
        L_0x0091:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.story.api.f> r1 = com.ss.android.ugc.aweme.story.api.f.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.story.api.f r0 = (com.ss.android.ugc.aweme.story.api.f) r0
            if (r0 != 0) goto L_0x00a0
            goto L_0x00a8
        L_0x00a0:
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r8 = 0
        L_0x00a8:
            if (r8 == 0) goto L_0x00bb
            com.ss.android.ugc.aweme.story.feed.view.ui.comment.KeyboardAwareEditText r0 = r10.f72872c
            com.ss.android.ugc.aweme.story.feed.view.ui.comment.KeyboardAwareEditText r1 = r10.f72872c
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131562775(0x7f0d1117, float:1.8750988E38)
            java.lang.String r1 = r1.getString(r2)
            r7 = r0
            goto L_0x0110
        L_0x00bb:
            com.ss.android.ugc.aweme.story.feed.view.ui.comment.KeyboardAwareEditText r7 = r10.f72872c
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f72871b
            r3 = 0
            r4 = 84202(0x148ea, float:1.17992E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00e5
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f72871b
            r3 = 0
            r4 = 84202(0x148ea, float:1.17992E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0110
        L_0x00e5:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.story.api.f> r1 = com.ss.android.ugc.aweme.story.api.f.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.story.api.f r0 = (com.ss.android.ugc.aweme.story.api.f) r0
            if (r0 == 0) goto L_0x0103
            java.lang.String r1 = r0.g()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00fe
            goto L_0x0103
        L_0x00fe:
            java.lang.String r1 = r0.g()
            goto L_0x0110
        L_0x0103:
            com.ss.android.ugc.aweme.story.feed.view.ui.comment.KeyboardAwareEditText r0 = r10.f72872c
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131562776(0x7f0d1118, float:1.875099E38)
            java.lang.String r1 = r0.getString(r1)
        L_0x0110:
            r7.setHint(r1)
            android.text.TextWatcher r0 = r10.k
            if (r0 == 0) goto L_0x011e
            com.ss.android.ugc.aweme.story.feed.view.ui.comment.KeyboardAwareEditText r0 = r10.f72872c
            android.text.TextWatcher r1 = r10.k
            r0.addTextChangedListener(r1)
        L_0x011e:
            com.ss.android.ugc.aweme.story.feed.view.ui.comment.CommentEditTextWrapper r0 = r10.f72873d
            com.ss.android.ugc.aweme.story.feed.view.ui.comment.g r1 = new com.ss.android.ugc.aweme.story.feed.view.ui.comment.g
            r1.<init>(r10)
            r0.setPublishClickListener(r1)
            com.ss.android.ugc.aweme.story.feed.view.ui.comment.CommentEditTextWrapper r0 = r10.f72873d
            com.ss.android.ugc.aweme.story.feed.view.ui.comment.h r1 = new com.ss.android.ugc.aweme.story.feed.view.ui.comment.h
            r1.<init>(r10)
            r0.post(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.view.ui.comment.StoryReplyDialog.a(android.view.View):void");
    }

    public static StoryReplyDialog a(String str, b bVar, boolean z) {
        String str2 = str;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{str2, bVar2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f72871b, true, 84195, new Class[]{String.class, b.class, Boolean.TYPE}, StoryReplyDialog.class)) {
            return (StoryReplyDialog) PatchProxy.accessDispatch(new Object[]{str2, bVar2, Byte.valueOf(z)}, null, f72871b, true, 84195, new Class[]{String.class, b.class, Boolean.TYPE}, StoryReplyDialog.class);
        }
        StoryReplyDialog storyReplyDialog = new StoryReplyDialog();
        Bundle bundle = new Bundle();
        bundle.putString("key_content", str2);
        bundle.putBoolean("key_is_from_wipe_up", z);
        storyReplyDialog.setArguments(bundle);
        storyReplyDialog.f72875f = bVar2;
        return storyReplyDialog;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f72871b, false, 84200, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.ke, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f72871b, false, 84200, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}

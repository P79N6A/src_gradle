package com.ss.android.ugc.aweme.comment.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.input.emoji.c;
import com.bytedance.ies.dmt.ui.input.emoji.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.comment.i;
import com.ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.ss.android.ugc.aweme.common.ui.BaseDialogFragment;
import com.ss.android.ugc.aweme.detail.ui.FadeImageView;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.d.ae;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.widget.e;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.utils.aj;
import com.ss.android.ugc.aweme.utils.dz;
import com.ss.android.ugc.aweme.utils.imm.RomUtils;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class KeyboardDialogFragment extends BaseDialogFragment implements DialogInterface.OnShowListener, TextWatcher, n, com.ss.android.ugc.aweme.common.keyboard.b {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f36508b;

    /* renamed from: a  reason: collision with root package name */
    private dz f36509a;

    /* renamed from: c  reason: collision with root package name */
    public a f36510c;

    /* renamed from: d  reason: collision with root package name */
    public b f36511d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f36512e;

    /* renamed from: f  reason: collision with root package name */
    protected int f36513f;
    protected boolean g;
    protected boolean h;
    public boolean i;
    protected int j;
    protected boolean k = false;
    public boolean l = true;
    @BindView(2131493133)
    FadeImageView mAtView;
    @BindView(2131493502)
    AppCompatCheckBox mCbForward;
    @BindView(2131493631)
    public MentionEditText mEditText;
    @BindView(2131495019)
    FadeImageView mEmojiView;
    @BindView(2131496097)
    LinearLayout mMiniPanelContainer;
    @BindView(2131496082)
    MeasureLinearLayout mOutWrapper;
    @BindView(2131496096)
    LinearLayout mPanelContainer;
    @BindView(2131493646)
    FadeImageView mPublishView;
    @BindView(2131496081)
    LinearLayout outView;
    private g q;
    private Pattern r = Pattern.compile("^\\s*$");
    private boolean s = true;

    public interface a {
        void a(int i);

        void a(CharSequence charSequence);

        void a(CharSequence charSequence, List<TextExtraStruct> list, boolean z);

        void a(String str);

        void a(String str, int i);

        void a(boolean z);

        void b(int i);
    }

    public interface b {
        void a(Parcelable parcelable);

        void h();
    }

    public int a() {
        return 2130839123;
    }

    public int b() {
        return 2130839126;
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public final boolean a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{str3, str4}, this, f36508b, false, 27553, new Class[]{String.class, String.class}, Boolean.TYPE)) {
            return this.mEditText.a(0, str3, str4);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f36508b, false, 27553, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        if (this.k && this.f36510c != null) {
            this.f36510c.a("icon");
        }
        a(this.k, 0);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f36508b, false, 27555, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36508b, false, 27555, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.common.ui.b.a((Activity) getActivity(), (View) this.mEditText);
        dismiss();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f36508b, false, 27552, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36508b, false, 27552, new Class[0], Void.TYPE);
            return;
        }
        if (this.f36510c != null) {
            this.f36510c.a(this.mEditText.getText(), this.mEditText.getTextExtraStructList(), this.h);
            this.f36509a.a("comment");
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f36508b, false, 27560, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36508b, false, 27560, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        com.ss.android.ugc.aweme.common.keyboard.a keyBoardObservable = this.mOutWrapper.getKeyBoardObservable();
        if (PatchProxy.isSupport(new Object[]{this}, keyBoardObservable, com.ss.android.ugc.aweme.common.keyboard.a.f40238a, false, 33443, new Class[]{com.ss.android.ugc.aweme.common.keyboard.b.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.common.keyboard.a aVar = keyBoardObservable;
            PatchProxy.accessDispatch(new Object[]{this}, aVar, com.ss.android.ugc.aweme.common.keyboard.a.f40238a, false, 33443, new Class[]{com.ss.android.ugc.aweme.common.keyboard.b.class}, Void.TYPE);
            return;
        }
        if (keyBoardObservable.f40242d != null) {
            keyBoardObservable.f40242d.remove(this);
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f36508b, false, 27559, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36508b, false, 27559, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        com.ss.android.ugc.aweme.common.keyboard.a keyBoardObservable = this.mOutWrapper.getKeyBoardObservable();
        if (PatchProxy.isSupport(new Object[]{this}, keyBoardObservable, com.ss.android.ugc.aweme.common.keyboard.a.f40238a, false, 33442, new Class[]{com.ss.android.ugc.aweme.common.keyboard.b.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.common.keyboard.a aVar = keyBoardObservable;
            PatchProxy.accessDispatch(new Object[]{this}, aVar, com.ss.android.ugc.aweme.common.keyboard.a.f40238a, false, 33442, new Class[]{com.ss.android.ugc.aweme.common.keyboard.b.class}, Void.TYPE);
        } else {
            if (keyBoardObservable.f40242d == null) {
                keyBoardObservable.f40242d = new ArrayList();
            }
            keyBoardObservable.f40242d.add(this);
        }
        if (!this.k) {
            this.mEditText.requestFocus();
        }
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f36508b, false, 27558, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36508b, false, 27558, new Class[0], Void.TYPE);
            return;
        }
        if (AbTestManager.a().aK()) {
            i iVar = i.f36472f;
            if (PatchProxy.isSupport(new Object[0], iVar, i.f36467a, false, 27176, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], iVar, i.f36467a, false, 27176, new Class[0], Void.TYPE);
            } else if (i.f36471e.get()) {
                iVar.a().a(i.f36469c.toJson((Object) iVar.b(), i.f36470d));
                i.f36471e.set(false);
            }
        }
        try {
            super.dismiss();
        } catch (IllegalStateException unused) {
            super.dismissAllowingStateLoss();
        }
        if (this.f36511d != null) {
            this.f36511d.a(this.mEditText.onSaveInstanceState());
        }
    }

    public void onShow(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f36508b, false, 27562, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f36508b, false, 27562, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        if (this.f36511d != null) {
            this.f36511d.h();
        }
    }

    private void e(boolean z) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f36508b, false, 27548, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f36508b, false, 27548, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (AbTestManager.a().aK()) {
            LinearLayout linearLayout = this.mMiniPanelContainer;
            if (!z) {
                i2 = 8;
            }
            linearLayout.setVisibility(i2);
        }
    }

    public void afterTextChanged(Editable editable) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{editable}, this, f36508b, false, 27561, new Class[]{Editable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{editable}, this, f36508b, false, 27561, new Class[]{Editable.class}, Void.TYPE);
            return;
        }
        FadeImageView fadeImageView = this.mPublishView;
        if (editable == null || editable.length() <= 0 || this.r.matcher(editable).matches()) {
            z = false;
        }
        fadeImageView.setEnabled(z);
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f36508b, false, 27557, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f36508b, false, 27557, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!com.ss.android.g.a.a()) {
            this.l = z;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(boolean z) {
        if (!this.s) {
            com.bytedance.ies.dmt.ui.d.a.c(getContext(), (int) C0906R.string.a21).a();
            this.mCbForward.setChecked(false);
            return;
        }
        this.h = z;
        if (z) {
            this.mEditText.setFilters(new InputFilter[]{new e(60)});
            if (this.q != null) {
                this.q.f36590b = 60;
            }
        } else {
            this.mEditText.setFilters(new InputFilter[]{new e(100)});
            if (this.q != null) {
                this.q.f36590b = 100;
            }
        }
        if (this.f36510c != null) {
            this.f36510c.a(z);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.isSupport(new Object[]{configuration}, this, f36508b, false, 27538, new Class[]{Configuration.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{configuration}, this, f36508b, false, 27538, new Class[]{Configuration.class}, Void.TYPE);
            return;
        }
        super.onConfigurationChanged(configuration);
        if (this.mOutWrapper != null) {
            MeasureLinearLayout measureLinearLayout = this.mOutWrapper;
            if (PatchProxy.isSupport(new Object[0], measureLinearLayout, MeasureLinearLayout.f40234a, false, 33449, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], measureLinearLayout, MeasureLinearLayout.f40234a, false, 33449, new Class[0], Void.TYPE);
            } else if (RomUtils.b()) {
                measureLinearLayout.f40235b++;
            }
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f36508b, false, 27544, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f36508b, false, 27544, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(1, C0906R.style.so);
        this.f36509a = new dz();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f36508b, false, 27545, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f36508b, false, 27545, new Class[]{Bundle.class}, Dialog.class);
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("showEmojiPanel")) {
            i2 = 21;
        } else {
            i2 = 19;
            this.k = true;
        }
        if (window != null) {
            window.setSoftInputMode(i2);
            window.setGravity(80);
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setCancelable(true);
        return onCreateDialog;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(boolean z) {
        if (z) {
            this.mEmojiView.setImageResource(a());
            this.mEmojiView.setContentDescription(d.a().getString(C0906R.string.bd));
            KeyboardUtils.a(this.mEditText);
        } else {
            this.mEmojiView.setImageResource(b());
            this.mEmojiView.setContentDescription(d.a().getString(C0906R.string.be));
            KeyboardUtils.c(this.mEditText);
        }
        this.k = !z;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f36508b, false, 27556, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f36508b, false, 27556, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!com.ss.android.g.a.a()) {
            this.s = z;
        }
    }

    public void onActivityCreated(Bundle bundle) {
        int i2;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        Object value;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f36508b, false, 27547, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f36508b, false, 27547, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        getDialog().getWindow().setLayout(-1, -1);
        getDialog().setOnShowListener(this);
        this.mPublishView.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36514a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f36514a, false, 27571, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f36514a, false, 27571, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (!KeyboardDialogFragment.this.l) {
                    com.bytedance.ies.dmt.ui.d.a.c(KeyboardDialogFragment.this.getContext(), (int) C0906R.string.a20).a();
                } else {
                    aj.a(KeyboardDialogFragment.this.getContext(), new com.ss.android.ugc.aweme.d.b() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f36516a;

                        public final void a() {
                        }

                        public final void a(boolean z) {
                            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f36516a, false, 27572, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f36516a, false, 27572, new Class[]{Boolean.TYPE}, Void.TYPE);
                                return;
                            }
                            KeyboardDialogFragment.this.c();
                        }
                    });
                }
            }
        });
        this.mAtView.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36518a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f36518a, false, 27573, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f36518a, false, 27573, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (KeyboardDialogFragment.this.f36510c != null) {
                    KeyboardDialogFragment.this.f36510c.a(KeyboardDialogFragment.this.mEditText.getMentionTextCount());
                }
            }
        });
        this.mEmojiView.setOnClickListener(new i(this));
        FadeImageView fadeImageView = this.mEmojiView;
        if (this.k) {
            i2 = b();
        } else {
            i2 = a();
        }
        fadeImageView.setImageResource(i2);
        FadeImageView fadeImageView2 = this.mEmojiView;
        Context a2 = d.a();
        if (this.k) {
            i3 = C0906R.string.be;
        } else {
            i3 = C0906R.string.bd;
        }
        fadeImageView2.setContentDescription(a2.getString(i3));
        this.mEditText = (MentionEditText) getView().findViewById(C0906R.id.v7);
        this.f36509a.a((EditText) this.mEditText);
        this.mEditText.setMentionTextColor(ContextCompat.getColor(d.a(), C0906R.color.zl));
        this.mEditText.setOnMentionInputListener(new MentionEditText.e() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36520a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f36520a, false, 27574, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f36520a, false, 27574, new Class[0], Void.TYPE);
                    return;
                }
                if (KeyboardDialogFragment.this.f36510c != null && KeyboardDialogFragment.this.f36512e) {
                    KeyboardDialogFragment.this.f36510c.b(KeyboardDialogFragment.this.mEditText.getMentionTextCount());
                }
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.j = arguments.getInt("maxLength");
            if (this.j > 0) {
                this.mEditText.setFilters(new InputFilter[]{new e(this.j)});
            }
            Parcelable parcelable = arguments.getParcelable("savedInstanceState");
            if (parcelable != null) {
                this.mEditText.onRestoreInstanceState(parcelable);
                g.a((TextView) this.mEditText);
            }
            CharSequence charSequence = arguments.getCharSequence("hint");
            if (charSequence != null) {
                this.mEditText.setHint(charSequence);
            }
            this.mEditText.addTextChangedListener(this);
            this.mEditText.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f36522a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f36522a, false, 27575, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f36522a, false, 27575, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (KeyboardDialogFragment.this.k && KeyboardDialogFragment.this.f36510c != null) {
                        KeyboardDialogFragment.this.f36510c.a("box");
                    }
                    KeyboardDialogFragment.this.a(true, 0);
                }
            });
            User user = (User) arguments.getSerializable(AllStoryActivity.f73306b);
            if (user != null) {
                this.mEditText.setHint(d.a().getString(C0906R.string.bz8, new Object[]{ae.a(user)}));
                if (this.f36510c != null) {
                    this.f36510c.a(this.mEditText.getHint());
                }
                if (!TextUtils.equals(user.getUid(), com.ss.android.ugc.aweme.account.d.a().getCurUserId())) {
                    if (PatchProxy.isSupport(new Object[0], this, f36508b, false, 27565, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f36508b, false, 27565, new Class[0], Void.TYPE);
                    } else if (!com.ss.android.g.a.a() && AbTestManager.a().Z()) {
                        com.ss.android.ugc.aweme.comment.g gVar = com.ss.android.ugc.aweme.comment.g.f36447d;
                        if (PatchProxy.isSupport(new Object[0], gVar, com.ss.android.ugc.aweme.comment.g.f36444a, false, 27157, new Class[0], an.class)) {
                            value = PatchProxy.accessDispatch(new Object[0], gVar, com.ss.android.ugc.aweme.comment.g.f36444a, false, 27157, new Class[0], an.class);
                        } else {
                            value = com.ss.android.ugc.aweme.comment.g.f36446c.getValue();
                        }
                        an anVar = (an) value;
                        String str = (String) anVar.c();
                        String curUserId = com.ss.android.ugc.aweme.account.d.a().getCurUserId();
                        if (!str.contains(curUserId)) {
                            StringBuilder sb = new StringBuilder(str);
                            View findViewById = this.mOutWrapper.findViewById(C0906R.id.bko);
                            findViewById.setVisibility(0);
                            sb.append(curUserId);
                            sb.append(";");
                            anVar.a(sb.toString());
                            findViewById.animate().setInterpolator(new AccelerateDecelerateInterpolator()).setStartDelay(3000).alpha(0.0f).setDuration(200).start();
                        }
                    }
                }
            }
            HashSet hashSet = (HashSet) arguments.getSerializable("atUserSet");
            if (hashSet != null) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    User user2 = (User) it2.next();
                    a(ae.b(user2), user2.getUid());
                }
            }
            User user3 = (User) arguments.getSerializable("atUser");
            if (user3 != null) {
                a(ae.b(user3), user3.getUid());
            }
            this.mPublishView.setVisibility(0);
            Editable text = this.mEditText.getText();
            FadeImageView fadeImageView3 = this.mPublishView;
            if (text == null || text.length() <= 0 || this.r.matcher(text).matches()) {
                z = false;
            } else {
                z = true;
            }
            fadeImageView3.setEnabled(z);
            boolean z4 = arguments.getBoolean("showAt");
            FadeImageView fadeImageView4 = this.mAtView;
            int i6 = 8;
            if (z4) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            fadeImageView4.setVisibility(i4);
            this.f36512e = z4;
            this.f36513f = arguments.getInt("viewType");
            this.g = arguments.getBoolean("canForward");
            if (!this.g || this.f36513f == 4) {
                z2 = false;
            } else {
                z2 = true;
            }
            AppCompatCheckBox appCompatCheckBox = this.mCbForward;
            if (z2) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            appCompatCheckBox.setVisibility(i5);
            if (!this.g || z2) {
                z3 = false;
            } else {
                z3 = true;
            }
            this.h = z3;
            if (!this.s) {
                this.mCbForward.setTextColor(getContext().getResources().getColor(C0906R.color.i2));
            } else {
                this.mCbForward.setTextColor(getContext().getResources().getColor(C0906R.color.a2e));
            }
            this.mCbForward.setOnCheckedChangeListener(new j(this));
            this.mOutWrapper.setOnClickListener(new k(this));
            this.mOutWrapper.findViewById(C0906R.id.y9).setOnClickListener(l.f36601b);
            Context context = getContext();
            if (PatchProxy.isSupport(new Object[]{context}, this, f36508b, false, 27550, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context}, this, f36508b, false, 27550, new Class[]{Context.class}, Void.TYPE);
            } else if (this.mPanelContainer != null) {
                if (this.q == null) {
                    this.q = new g(this.mEditText, this.j, this);
                }
                this.mPanelContainer.addView(new c(context, this.q).a());
            }
            LinearLayout linearLayout = this.mPanelContainer;
            if (this.k) {
                i6 = 0;
            }
            linearLayout.setVisibility(i6);
            if (AbTestManager.a().aK()) {
                Context context2 = getContext();
                if (PatchProxy.isSupport(new Object[]{context2}, this, f36508b, false, 27549, new Class[]{Context.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context2}, this, f36508b, false, 27549, new Class[]{Context.class}, Void.TYPE);
                } else if (this.mMiniPanelContainer != null) {
                    if (this.q == null) {
                        this.q = new g(this.mEditText, this.j, this);
                    }
                    this.mMiniPanelContainer.addView(new com.bytedance.ies.dmt.ui.input.emoji.i(context2, this.q, i.f36472f.c()).a());
                }
                e(!this.k);
            }
            if (bundle != null) {
                try {
                    super.dismiss();
                } catch (IllegalStateException unused) {
                    super.dismissAllowingStateLoss();
                }
            }
        }
    }

    public static KeyboardDialogFragment a(int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, null, f36508b, true, 27543, new Class[]{Integer.TYPE, Boolean.TYPE}, KeyboardDialogFragment.class)) {
            return (KeyboardDialogFragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z)}, null, f36508b, true, 27543, new Class[]{Integer.TYPE, Boolean.TYPE}, KeyboardDialogFragment.class);
        }
        KeyboardDialogFragment keyboardDialogFragment = new KeyboardDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("viewType", i2);
        bundle.putBoolean("canForward", z);
        keyboardDialogFragment.setArguments(bundle);
        return keyboardDialogFragment;
    }

    public final void b(boolean z, int i2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2)}, this, f36508b, false, 27563, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2)}, this, f36508b, false, 27563, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int i3 = 8;
        if (z) {
            this.mPanelContainer.setVisibility(8);
            e(true);
            return;
        }
        LinearLayout linearLayout = this.mPanelContainer;
        if (this.k) {
            i3 = 0;
        }
        linearLayout.setVisibility(i3);
        e(!this.k);
        if (this.i) {
            a(true, (int) com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f);
            this.i = false;
            return;
        }
        if (!this.k) {
            dismiss();
        }
    }

    public final void a(String str, int i2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, this, f36508b, false, 27564, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2)}, this, f36508b, false, 27564, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f36510c != null) {
            this.f36510c.a(str, i2);
        }
    }

    public final void a(boolean z, int i2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2)}, this, f36508b, false, 27551, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2)}, this, f36508b, false, 27551, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mEditText.postDelayed(new m(this, z), (long) i2);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f36508b, false, 27546, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f36508b, false, 27546, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.o8, viewGroup2, false);
        ButterKnife.bind((Object) this, inflate);
        return inflate;
    }

    public static KeyboardDialogFragment a(Parcelable parcelable, CharSequence charSequence, int i2, boolean z, int i3, boolean z2, boolean z3) {
        Parcelable parcelable2 = parcelable;
        CharSequence charSequence2 = charSequence;
        if (PatchProxy.isSupport(new Object[]{parcelable2, charSequence2, Integer.valueOf(i2), (byte) 1, Integer.valueOf(i3), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, null, f36508b, true, 27539, new Class[]{Parcelable.class, CharSequence.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, KeyboardDialogFragment.class)) {
            return (KeyboardDialogFragment) PatchProxy.accessDispatch(new Object[]{parcelable2, charSequence2, Integer.valueOf(i2), (byte) 1, Integer.valueOf(i3), Byte.valueOf(z2), Byte.valueOf(z3)}, null, f36508b, true, 27539, new Class[]{Parcelable.class, CharSequence.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, KeyboardDialogFragment.class);
        }
        KeyboardDialogFragment a2 = a(i3, z2);
        Bundle arguments = a2.getArguments();
        if (arguments != null) {
            arguments.putParcelable("savedInstanceState", parcelable2);
            arguments.putCharSequence("hint", charSequence2);
            arguments.putInt("maxLength", i2);
            arguments.putBoolean("showAt", true);
            arguments.putBoolean("showEmojiPanel", z3);
        }
        return a2;
    }
}

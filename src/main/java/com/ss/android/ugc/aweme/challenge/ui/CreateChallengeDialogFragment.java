package com.ss.android.ugc.aweme.challenge.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.challenge.a.b;
import com.ss.android.ugc.aweme.challenge.api.a;
import com.ss.android.ugc.aweme.challenge.c.c;
import com.ss.android.ugc.aweme.challenge.c.h;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.ui.BaseDialogFragment;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.ui.ChooseMusicActivity;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Map;
import java.util.UUID;

public class CreateChallengeDialogFragment extends BaseDialogFragment implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35517a;

    /* renamed from: b  reason: collision with root package name */
    private c f35518b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.shortvideo.view.c f35519c;

    /* renamed from: d  reason: collision with root package name */
    private int f35520d;

    /* renamed from: e  reason: collision with root package name */
    private DialogInterface.OnKeyListener f35521e = new DialogInterface.OnKeyListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35525a;

        /* renamed from: c  reason: collision with root package name */
        private boolean f35527c;

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, f35525a, false, 26208, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, f35525a, false, 26208, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (keyEvent.getAction() == 0) {
                this.f35527c = true;
                return false;
            } else if (4 != i || !this.f35527c) {
                return false;
            } else {
                CreateChallengeDialogFragment.this.back();
                this.f35527c = false;
                return true;
            }
        }
    };
    @BindView(2131493726)
    TextView mConfirmView;
    @BindView(2131493789)
    TextView mCountView;
    @BindView(2131497501)
    View mDeleteView;
    @BindView(2131493524)
    EditText mEditDescView;
    @BindView(2131493530)
    EditText mEditTitleView;
    @BindView(2131497590)
    TextView mTitleView;

    @OnClick({2131493213})
    public void back() {
        if (PatchProxy.isSupport(new Object[0], this, f35517a, false, 26201, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35517a, false, 26201, new Class[0], Void.TYPE);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(0);
            activity.onBackPressed();
            activity.finish();
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f35517a, false, 26196, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35517a, false, 26196, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.f35518b != null) {
            this.f35518b.k();
        }
        if (this.f35519c != null) {
            this.f35519c.dismiss();
            this.f35519c = null;
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f35517a, false, 26191, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f35517a, false, 26191, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(1, C0906R.style.qq);
    }

    @OnTextChanged({2131493524})
    public void onDescTextChange(CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f35517a, false, 26200, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, f35517a, false, 26200, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        a(charSequence);
    }

    private void a(CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f35517a, false, 26202, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, f35517a, false, 26202, new Class[]{CharSequence.class}, Void.TYPE);
        } else if (TextUtils.isEmpty(charSequence)) {
            this.mCountView.setText(C0906R.string.a4z);
        } else {
            this.mCountView.setText(getActivity().getString(C0906R.string.a4y, new Object[]{Integer.valueOf(60 - charSequence.length())}));
        }
    }

    @OnTextChanged({2131493530})
    public void onTitleTextChange(CharSequence charSequence) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f35517a, false, 26199, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, f35517a, false, 26199, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        View view = this.mDeleteView;
        if (TextUtils.isEmpty(charSequence)) {
            i = 4;
        }
        view.setVisibility(i);
    }

    public final void a(Challenge challenge) {
        if (PatchProxy.isSupport(new Object[]{challenge}, this, f35517a, false, 26204, new Class[]{Challenge.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{challenge}, this, f35517a, false, 26204, new Class[]{Challenge.class}, Void.TYPE);
        } else if (i()) {
            this.f35519c.dismiss();
            b(challenge);
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f35517a, false, 26203, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f35517a, false, 26203, new Class[]{Exception.class}, Void.TYPE);
        } else if (i()) {
            this.f35519c.dismiss();
            if (exc instanceof a) {
                a aVar = (a) exc;
                if (aVar.getErrorCode() == 2069) {
                    final Challenge challenge = aVar.getChallenge();
                    if (PatchProxy.isSupport(new Object[]{challenge}, this, f35517a, false, 26206, new Class[]{Challenge.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{challenge}, this, f35517a, false, 26206, new Class[]{Challenge.class}, Void.TYPE);
                        return;
                    }
                    if (getActivity() != null) {
                        new AlertDialog.Builder(getActivity()).setTitle((int) C0906R.string.rd).setMessage((int) C0906R.string.re).setNegativeButton((int) C0906R.string.kj, (DialogInterface.OnClickListener) null).setPositiveButton((int) C0906R.string.rg, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f35522a;

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f35522a, false, 26207, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f35522a, false, 26207, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                CreateChallengeDialogFragment.this.b(challenge);
                            }
                        }).show();
                    }
                    return;
                }
            }
            if (getActivity() != null) {
                com.ss.android.ugc.aweme.app.api.a.a.a(getActivity(), exc, C0906R.string.ra);
            }
        }
    }

    public final void b(Challenge challenge) {
        Challenge challenge2 = challenge;
        if (PatchProxy.isSupport(new Object[]{challenge2}, this, f35517a, false, 26205, new Class[]{Challenge.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{challenge2}, this, f35517a, false, 26205, new Class[]{Challenge.class}, Void.TYPE);
            return;
        }
        ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().addChallenge(com.ss.android.ugc.aweme.shortvideo.o.a.b(challenge));
        if (this.f35520d == 0) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                r.a(getContext(), "add_challenge", "publish", challenge.getCid(), 0);
                if (com.ss.android.g.a.a()) {
                    activity.setResult(-1);
                    activity.onBackPressed();
                } else {
                    bg.a(new b(challenge2));
                }
            }
            return;
        }
        AmeActivity ameActivity = (AmeActivity) getActivity();
        ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(null);
        if (!d.a().isLogin()) {
            e.a((Activity) ameActivity, "publish", "add_challenge");
        } else if (ameActivity != null && ChooseMusicActivity.a(getContext())) {
            String uuid = UUID.randomUUID().toString();
            r.a("shoot", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", uuid).a("shoot_way", "challenge").a("_staging_flag", com.ss.android.g.a.b() ^ true ? 1 : 0).a("tag_id", challenge.getCid()).f34114b);
            Intent intent = new Intent();
            intent.putExtra("shoot_way", "challenge");
            intent.putExtra("creation_id", uuid);
            intent.putExtra("translation_type", 3);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            intent.putExtra("challenge", new com.ss.android.ugc.aweme.shortvideo.o.a().apply(challenge2));
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) ameActivity, intent);
            ameActivity.finish();
            r.a(getContext(), "challenge_create", "publish", challenge.getCid(), 0);
        }
    }

    @OnClick({2131493726, 2131493213, 2131497501})
    public void click(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f35517a, false, 26197, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f35517a, false, 26197, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.ix) {
            if (this.f35520d == 1) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.setResult(-1);
                    activity.onBackPressed();
                    activity.finish();
                }
            }
        } else if (id == C0906R.id.y2) {
            if (PatchProxy.isSupport(new Object[0], this, f35517a, false, 26198, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f35517a, false, 26198, new Class[0], Void.TYPE);
            } else if (i() && getActivity() != null) {
                if (!NetworkUtils.isNetworkAvailable(getActivity())) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
                } else {
                    String trim = this.mEditTitleView.getText().toString().trim();
                    if (TextUtils.isEmpty(trim)) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.rh).a();
                    } else {
                        FragmentActivity activity2 = getActivity();
                        if (activity2 != null) {
                            this.f35519c = com.ss.android.ugc.aweme.shortvideo.view.c.a(activity2, activity2.getString(C0906R.string.brl));
                            if (this.f35518b != null) {
                                this.f35518b.a(trim, this.mEditDescView.getText().toString().trim());
                            }
                        }
                    }
                }
            }
            com.ss.android.ugc.aweme.common.ui.b.a((Activity) getActivity(), (View) this.mEditDescView);
        } else if (id == C0906R.id.d0h) {
            this.mEditTitleView.setText("");
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f35517a, false, 26195, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f35517a, false, 26195, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f35517a, false, 26194, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35517a, false, 26194, new Class[0], Void.TYPE);
        } else {
            Bundle arguments = getArguments();
            String string = arguments.getString("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_NAME");
            if (!TextUtils.isEmpty(string)) {
                this.mEditTitleView.setText(string);
                this.mEditDescView.setSelection(0);
            } else {
                this.mEditTitleView.setSelection(0);
                this.mEditTitleView.setText("");
            }
            this.mEditTitleView.setSelection(this.mEditTitleView.getText().length());
            this.f35520d = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 1);
        }
        TextView textView = this.mConfirmView;
        if (this.f35520d == 0) {
            i = C0906R.string.a0v;
        } else {
            i = C0906R.string.b53;
        }
        textView.setText(i);
        if (bundle == null) {
            this.mEditDescView.setText("");
        }
        a((CharSequence) this.mEditDescView.getText());
        this.f35518b = new c();
        this.f35518b.a(this);
        getDialog().setOnKeyListener(this.f35521e);
        if (this.f35520d == 0) {
            getDialog().getWindow().getAttributes().windowAnimations = C0906R.style.r9;
        }
        EditText editText = this.mEditDescView;
        if (PatchProxy.isSupport(new Object[]{editText}, this, BaseDialogFragment.m, false, 33497, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{editText}, this, BaseDialogFragment.m, false, 33497, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (editText != null) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                editText.postDelayed(new Runnable(activity, editText) {

                    /* renamed from: a */
                    public static ChangeQuickRedirect f40277a;

                    /* renamed from: b */
                    final /* synthetic */ Activity f40278b;

                    /* renamed from: c */
                    final /* synthetic */ View f40279c;

                    public final void run(
/*
Method generation error in method: com.ss.android.ugc.aweme.common.ui.BaseDialogFragment.1.run():void, dex: classes4.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.common.ui.BaseDialogFragment.1.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                    
*/
                }, 100);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f35517a, false, 26192, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f35517a, false, 26192, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.na, viewGroup2, false);
        ButterKnife.bind((Object) this, inflate);
        if (PatchProxy.isSupport(new Object[0], this, f35517a, false, 26193, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35517a, false, 26193, new Class[0], Void.TYPE);
        } else {
            this.mTitleView.setText(C0906R.string.r_);
            this.mTitleView.setTextColor(getResources().getColor(C0906R.color.anp));
            this.mTitleView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130838842, 0);
        }
        return inflate;
    }
}

package com.ss.android.ugc.aweme.captcha.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.image.CloseableImage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.captcha.a.e;
import com.ss.android.ugc.aweme.captcha.b.a;
import com.ss.android.ugc.aweme.captcha.b.b;
import com.ss.android.ugc.aweme.captcha.b.c;
import com.ss.android.ugc.aweme.captcha.b.d;
import com.ss.android.ugc.aweme.captcha.ui.DragBar;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public class CaptchaDialogFragment extends BottomSheetDialogFragment implements View.OnClickListener, a, b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35282a;

    /* renamed from: b  reason: collision with root package name */
    public AnimatedImageView f35283b;

    /* renamed from: c  reason: collision with root package name */
    public AnimatedImageView f35284c;

    /* renamed from: d  reason: collision with root package name */
    public View f35285d;

    /* renamed from: e  reason: collision with root package name */
    public DragBar f35286e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.captcha.b f35287f;
    public c g;
    public com.ss.android.ugc.aweme.captcha.a.b h;
    public View i;
    public Runnable j;
    public boolean k;
    public long l;
    public boolean m;
    int n;
    private View o;
    private TextView p;
    private d q;
    private int r;
    private boolean s;
    private float t;
    private float u;

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f35282a, false, 25735, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f35282a, false, 25735, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f35285d.animate().rotation(360.0f).setDuration(400).withEndAction(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35292a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f35292a, false, 25753, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f35292a, false, 25753, new Class[0], Void.TYPE);
                    return;
                }
                CaptchaDialogFragment.this.f35285d.setRotation(0.0f);
            }
        }).start();
        this.q.a(Boolean.valueOf(z));
    }

    public final void a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f35282a, false, 25737, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f35282a, false, 25737, new Class[]{Exception.class}, Void.TYPE);
        } else if (this.k) {
            com.ss.android.ugc.aweme.app.api.a.a.a((Context) getActivity(), (Throwable) exc2);
        }
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f35282a, false, 25747, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35282a, false, 25747, new Class[0], Void.TYPE);
            return;
        }
        synchronized (CaptchaDialogFragment.class) {
            if (this.f35287f != null) {
                this.f35287f.b();
                this.f35287f = null;
            }
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f35282a, false, 25748, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35282a, false, 25748, new Class[0], Void.TYPE);
            return;
        }
        this.q.k();
        this.g.k();
        super.onDestroyView();
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f35282a, false, 25727, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f35282a, false, 25727, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(0, C0906R.style.ff);
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f35282a, false, 25742, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f35282a, false, 25742, new Class[]{Exception.class}, Void.TYPE);
        } else if (this.k) {
            com.ss.android.ugc.aweme.app.api.a.a.a((Context) getActivity(), (Throwable) exc);
            this.f35286e.postDelayed(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f35299a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f35299a, false, 25756, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f35299a, false, 25756, new Class[0], Void.TYPE);
                    } else if (CaptchaDialogFragment.this.k) {
                        CaptchaDialogFragment.this.a(false);
                        CaptchaDialogFragment.this.f35286e.a();
                    }
                }
            }, 600);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f35282a, false, 25729, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f35282a, false, 25729, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new DialogInterface.OnShowListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f35288a;

                public final void onShow(DialogInterface dialogInterface) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f35288a, false, 25749, new Class[]{DialogInterface.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f35288a, false, 25749, new Class[]{DialogInterface.class}, Void.TYPE);
                        return;
                    }
                    FrameLayout frameLayout = (FrameLayout) ((BottomSheetDialog) dialogInterface).findViewById(C0906R.id.a3z);
                    if (frameLayout != null) {
                        BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout);
                        from.setPeekHeight(frameLayout.getHeight());
                        from.setSkipCollapsed(true);
                    }
                }
            });
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f35282a, false, 25746, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f35282a, false, 25746, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        super.onCancel(dialogInterface);
        this.k = false;
        this.i.removeCallbacks(this.j);
        if (!this.s && this.f35287f != null) {
            a();
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f35282a, false, 25734, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f35282a, false, 25734, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.azy) {
            dismiss();
            return;
        }
        if (id == C0906R.id.b4b) {
            if (this.j != null) {
                this.i.removeCallbacks(this.j);
            }
            a(true);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (!PatchProxy.isSupport(new Object[]{bundle}, this, f35282a, false, 25728, new Class[]{Bundle.class}, Dialog.class)) {
            return new BottomSheetDialog(getActivity(), getTheme());
        }
        return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f35282a, false, 25728, new Class[]{Bundle.class}, Dialog.class);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f35282a, false, 25745, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f35282a, false, 25745, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        super.onDismiss(dialogInterface);
        this.k = false;
        this.i.removeCallbacks(this.j);
        if (!this.s && this.f35287f != null) {
            a();
        }
    }

    public final void a(com.ss.android.ugc.aweme.captcha.a.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f35282a, false, 25738, new Class[]{com.ss.android.ugc.aweme.captcha.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f35282a, false, 25738, new Class[]{com.ss.android.ugc.aweme.captcha.a.b.class}, Void.TYPE);
        } else if (this.k && bVar != null) {
            this.h = bVar;
            a(this.f35283b, bVar.f35255a);
            a(this.f35284c, bVar.f35257c);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f35284c.getLayoutParams();
            layoutParams.setMargins(this.r, (int) ((((float) bVar.f35259e) * this.u) / ((float) bVar.f35256b.f35254b)), 0, 0);
            this.f35284c.setLayoutParams(layoutParams);
        }
    }

    public final void a(com.ss.android.ugc.aweme.captcha.a.c cVar) {
        com.ss.android.ugc.aweme.captcha.a.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f35282a, false, 25736, new Class[]{com.ss.android.ugc.aweme.captcha.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f35282a, false, 25736, new Class[]{com.ss.android.ugc.aweme.captcha.a.c.class}, Void.TYPE);
            return;
        }
        if (this.k && cVar2 != null) {
            d dVar = this.q;
            String str = cVar2.f35261a;
            if (PatchProxy.isSupport(new Object[]{str}, dVar, d.f35273a, false, 25723, new Class[]{String.class}, Void.TYPE)) {
                d dVar2 = dVar;
                PatchProxy.accessDispatch(new Object[]{str}, dVar2, d.f35273a, false, 25723, new Class[]{String.class}, Void.TYPE);
                return;
            }
            com.ss.android.b.a.a.a.a(new Runnable(str) {

                /* renamed from: a */
                public static ChangeQuickRedirect f35274a;

                /* renamed from: b */
                final /* synthetic */ String f35275b;

                public final void run(
/*
Method generation error in method: com.ss.android.ugc.aweme.captcha.b.d.1.run():void, dex: classes4.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.captcha.b.d.1.run():void, class status: UNLOADED
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
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
            });
        }
    }

    public final void a(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f35282a, false, 25741, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f35282a, false, 25741, new Class[]{e.class}, Void.TYPE);
        } else if (this.k) {
            com.bytedance.ies.dmt.ui.d.a.a(getContext(), eVar.f35266a).a();
            this.s = true;
            dismiss();
            if (this.f35287f != null) {
                this.f35287f.a();
            }
        }
    }

    private void a(AnimatedImageView animatedImageView, String str) {
        final AnimatedImageView animatedImageView2 = animatedImageView;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{animatedImageView2, str2}, this, f35282a, false, 25739, new Class[]{AnimatedImageView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{animatedImageView2, str2}, this, f35282a, false, 25739, new Class[]{AnimatedImageView.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.base.c.a((RemoteImageView) animatedImageView, str);
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(new ArrayList());
        urlModel.getUrlList().add(str2);
        com.ss.android.ugc.aweme.base.c.a(urlModel, (c.a) new c.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35294a;

            public final void a(Exception exc) {
            }

            public final void a(DataSource<CloseableReference<CloseableImage>> dataSource) {
                if (PatchProxy.isSupport(new Object[]{dataSource}, this, f35294a, false, 25754, new Class[]{DataSource.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dataSource}, this, f35294a, false, 25754, new Class[]{DataSource.class}, Void.TYPE);
                } else if (CaptchaDialogFragment.this.k) {
                    CaptchaDialogFragment.this.n++;
                    if (CaptchaDialogFragment.this.n == 2) {
                        CaptchaDialogFragment captchaDialogFragment = CaptchaDialogFragment.this;
                        if (PatchProxy.isSupport(new Object[0], captchaDialogFragment, CaptchaDialogFragment.f35282a, false, 25740, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], captchaDialogFragment, CaptchaDialogFragment.f35282a, false, 25740, new Class[0], Void.TYPE);
                        } else if (captchaDialogFragment.k && captchaDialogFragment.i != null) {
                            captchaDialogFragment.f35286e.setCanDragged(true);
                            captchaDialogFragment.m = false;
                            if (captchaDialogFragment.j == null) {
                                captchaDialogFragment.j = new Runnable() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f35297a;

                                    public final void run() {
                                        if (PatchProxy.isSupport(new Object[0], this, f35297a, false, 25755, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f35297a, false, 25755, new Class[0], Void.TYPE);
                                        } else if (CaptchaDialogFragment.this.k) {
                                            com.bytedance.ies.dmt.ui.d.a.b(CaptchaDialogFragment.this.getContext(), CaptchaDialogFragment.this.getString(C0906R.string.dqv)).a();
                                            CaptchaDialogFragment.this.m = true;
                                        }
                                    }
                                };
                            }
                            captchaDialogFragment.i.removeCallbacks(captchaDialogFragment.j);
                            captchaDialogFragment.i.postDelayed(captchaDialogFragment.j, (long) (((Integer) SharePrefCache.inst().getVerifyExceed().c()).intValue() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
                        }
                        CaptchaDialogFragment.this.n = 0;
                    }
                    if (animatedImageView2.getVisibility() == 4) {
                        animatedImageView2.setVisibility(0);
                    }
                }
            }
        });
    }

    public int show(FragmentTransaction fragmentTransaction, String str) {
        if (PatchProxy.isSupport(new Object[]{fragmentTransaction, str}, this, f35282a, false, 25743, new Class[]{FragmentTransaction.class, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{fragmentTransaction, str}, this, f35282a, false, 25743, new Class[]{FragmentTransaction.class, String.class}, Integer.TYPE)).intValue();
        }
        int show = super.show(fragmentTransaction, str);
        this.k = true;
        return show;
    }

    public final String a(float f2, long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), new Long(j3)}, this, f35282a, false, 25733, new Class[]{Float.TYPE, Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), new Long(j3)}, this, f35282a, false, 25733, new Class[]{Float.TYPE, Long.TYPE}, String.class);
        } else if (this.h == null) {
            return "";
        } else {
            int i2 = (int) (((float) (this.h.f35256b.f35253a - this.h.f35258d.f35253a)) * f2);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, this.h.f35260f + (j3 / 1000));
                jSONObject.put("offset", i2);
                return jSONObject.toString();
            } catch (JSONException unused) {
                return "";
            }
        }
    }

    public void show(FragmentManager fragmentManager, String str) {
        if (PatchProxy.isSupport(new Object[]{fragmentManager, str}, this, f35282a, false, 25744, new Class[]{FragmentManager.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager, str}, this, f35282a, false, 25744, new Class[]{FragmentManager.class, String.class}, Void.TYPE);
            return;
        }
        super.show(fragmentManager, str);
        this.k = true;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f35282a, false, 25730, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f35282a, false, 25730, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.i = view;
        this.o = view.findViewById(C0906R.id.azy);
        this.f35283b = (AnimatedImageView) view.findViewById(C0906R.id.azk);
        this.f35284c = (AnimatedImageView) view.findViewById(C0906R.id.b0s);
        this.f35286e = (DragBar) view.findViewById(C0906R.id.a7w);
        this.f35285d = view.findViewById(C0906R.id.b4b);
        this.p = (TextView) view.findViewById(C0906R.id.title);
        this.f35284c.setVisibility(4);
        if (PatchProxy.isSupport(new Object[0], this, f35282a, false, 25731, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35282a, false, 25731, new Class[0], Void.TYPE);
        } else {
            this.t = UIUtils.dip2Px(getContext(), 262.5f);
            this.u = UIUtils.dip2Px(getContext(), 150.0f);
            this.f35283b.getLayoutParams().width = (int) this.t;
            this.f35283b.getLayoutParams().height = (int) this.u;
            this.f35284c.getLayoutParams().width = (int) (this.t * 0.33333334f);
            this.f35284c.getLayoutParams().height = (int) (this.u * 0.4f);
            this.r = (int) ((((float) UIUtils.getScreenWidth(getContext())) - this.t) / 2.0f);
        }
        if (PatchProxy.isSupport(new Object[0], this, f35282a, false, 25732, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35282a, false, 25732, new Class[0], Void.TYPE);
            return;
        }
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null) {
            str = arguments.getString(PushConstants.TITLE, "");
        }
        if (!TextUtils.isEmpty(str)) {
            this.p.setText(str);
        }
        this.o.setOnClickListener(this);
        this.f35285d.setOnClickListener(this);
        this.f35286e.setOnDragListener(new DragBar.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35290a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f35290a, false, 25750, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f35290a, false, 25750, new Class[0], Void.TYPE);
                    return;
                }
                CaptchaDialogFragment.this.l = System.currentTimeMillis();
            }

            public final void a(float f2) {
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f35290a, false, 25751, new Class[]{Float.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f35290a, false, 25751, new Class[]{Float.TYPE}, Void.TYPE);
                    return;
                }
                CaptchaDialogFragment.this.f35284c.setTranslationX(((float) (CaptchaDialogFragment.this.f35283b.getMeasuredWidth() - CaptchaDialogFragment.this.f35284c.getMeasuredWidth())) * f2);
            }

            public final void b(float f2) {
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f35290a, false, 25752, new Class[]{Float.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f35290a, false, 25752, new Class[]{Float.TYPE}, Void.TYPE);
                    return;
                }
                if (CaptchaDialogFragment.this.m) {
                    if (CaptchaDialogFragment.this.j != null) {
                        CaptchaDialogFragment.this.i.removeCallbacks(CaptchaDialogFragment.this.j);
                    }
                    com.bytedance.ies.dmt.ui.d.a.b(CaptchaDialogFragment.this.getContext(), (int) C0906R.string.dqv).a();
                    CaptchaDialogFragment.this.f35286e.a();
                    CaptchaDialogFragment.this.f35286e.setCanDragged(true);
                } else {
                    if (CaptchaDialogFragment.this.j != null) {
                        CaptchaDialogFragment.this.i.removeCallbacks(CaptchaDialogFragment.this.j);
                    }
                    if (CaptchaDialogFragment.this.h != null) {
                        CaptchaDialogFragment.this.g.a(CaptchaDialogFragment.this.a(f2, System.currentTimeMillis() - CaptchaDialogFragment.this.l));
                    }
                }
                CaptchaDialogFragment.this.l = 0;
            }
        });
        this.f35286e.setCanDragged(false);
        this.q = new d();
        this.q.a(this);
        this.q.a(Boolean.FALSE);
        this.g = new com.ss.android.ugc.aweme.captcha.b.c();
        this.g.a(this);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f35282a, false, 25726, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.n5, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f35282a, false, 25726, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}

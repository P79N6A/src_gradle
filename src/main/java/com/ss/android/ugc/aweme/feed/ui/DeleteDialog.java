package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.CoordinatorLayout;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public class DeleteDialog extends BottomSheetDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46102a;

    /* renamed from: b  reason: collision with root package name */
    aa<ar> f46103b;

    /* renamed from: c  reason: collision with root package name */
    public Aweme f46104c;

    /* renamed from: d  reason: collision with root package name */
    private String f46105d;

    /* renamed from: e  reason: collision with root package name */
    private Activity f46106e;

    /* renamed from: f  reason: collision with root package name */
    private int f46107f;
    @BindView(2131496852)
    CoordinatorLayout mRootView;

    @OnClick({2131493455})
    public void cancel() {
        if (PatchProxy.isSupport(new Object[0], this, f46102a, false, 42480, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46102a, false, 42480, new Class[0], Void.TYPE);
            return;
        }
        dismiss();
    }

    @OnClick({2131493901})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f46102a, false, 42479, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f46102a, false, 42479, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f46102a, false, 42481, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46102a, false, 42481, new Class[0], Void.TYPE);
            return;
        }
        a.C0185a aVar = new a.C0185a(this.f46106e);
        aVar.a((int) C0906R.string.a4n);
        aVar.b((int) C0906R.string.pm, (DialogInterface.OnClickListener) null).a((int) C0906R.string.a4k, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46108a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f46108a, false, 42486, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f46108a, false, 42486, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                DeleteDialog deleteDialog = DeleteDialog.this;
                if (PatchProxy.isSupport(new Object[]{2}, deleteDialog, DeleteDialog.f46102a, false, 42482, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    ChangeQuickRedirect changeQuickRedirect = DeleteDialog.f46102a;
                    DeleteDialog deleteDialog2 = deleteDialog;
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    PatchProxy.accessDispatch(new Object[]{2}, deleteDialog2, changeQuickRedirect2, false, 42482, new Class[]{Integer.TYPE}, Void.TYPE);
                } else if (deleteDialog.f46103b != null) {
                    deleteDialog.f46103b.a(new ar(2, deleteDialog.f46104c));
                }
                DeleteDialog.this.dismiss();
            }
        }).a().a();
    }

    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f46102a, false, 42478, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f46102a, false, 42478, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.is);
        ButterKnife.bind((Dialog) this);
        Activity ownerActivity = getOwnerActivity();
        if (PatchProxy.isSupport(new Object[]{ownerActivity}, null, f46102a, true, 42484, new Class[]{Activity.class}, Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[]{ownerActivity}, null, f46102a, true, 42484, new Class[]{Activity.class}, Integer.TYPE)).intValue();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ownerActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            i = displayMetrics.heightPixels;
        }
        Context context = getContext();
        if (PatchProxy.isSupport(new Object[]{context}, null, f46102a, true, 42485, new Class[]{Context.class}, Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f46102a, true, 42485, new Class[]{Context.class}, Integer.TYPE)).intValue();
        } else {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i2 = resources.getDimensionPixelSize(identifier);
            } else {
                i2 = 0;
            }
        }
        int i3 = i - i2;
        Window window = getWindow();
        if (window != null) {
            if (i3 == 0) {
                i3 = -1;
            }
            window.setLayout(-1, i3);
            CoordinatorLayout coordinatorLayout = this.mRootView;
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout}, this, f46102a, false, 42483, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{coordinatorLayout}, this, f46102a, false, 42483, new Class[]{View.class}, Void.TYPE);
            } else {
                final BottomSheetBehavior from = BottomSheetBehavior.from((View) coordinatorLayout.getParent());
                if (from != null) {
                    from.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f46110a;

                        public final void onSlide(@NonNull View view, float f2) {
                        }

                        public final void onStateChanged(@NonNull View view, int i) {
                            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f46110a, false, 42487, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f46110a, false, 42487, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            if (i == 5) {
                                DeleteDialog.this.dismiss();
                                from.setState(4);
                            }
                        }
                    });
                }
            }
            window.setGravity(80);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.gravity = 80;
            getWindow().setAttributes(attributes);
            setCanceledOnTouchOutside(true);
        }
    }

    public DeleteDialog(Activity activity, aa<ar> aaVar, String str, int i) {
        super(activity, C0906R.style.re);
        this.f46106e = activity;
        setOwnerActivity(activity);
        this.f46103b = aaVar;
        this.f46105d = str;
        this.f46107f = i;
    }
}

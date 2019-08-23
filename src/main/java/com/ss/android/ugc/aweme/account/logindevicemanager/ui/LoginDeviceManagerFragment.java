package com.ss.android.ugc.aweme.account.logindevicemanager.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.bytedance.sdk.account.api.a.c;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.d;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.sdk.b.b;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.logindevicemanager.a.a;
import com.ss.android.ugc.aweme.account.logindevicemanager.adapter.LoginDeviceAdapter;
import com.ss.android.ugc.aweme.account.ui.BindMobileActivity;
import com.ss.android.ugc.aweme.account.util.p;
import com.ss.android.ugc.aweme.account.view.WrapLinearLayoutManager;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class LoginDeviceManagerFragment extends AmeBaseFragment implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32675a;

    /* renamed from: b  reason: collision with root package name */
    LoginDeviceAdapter f32676b;

    /* renamed from: c  reason: collision with root package name */
    boolean f32677c;

    /* renamed from: d  reason: collision with root package name */
    public d f32678d;

    /* renamed from: e  reason: collision with root package name */
    private DmtStatusView f32679e;

    /* renamed from: f  reason: collision with root package name */
    private LoginDeviceAdapter.a f32680f = new LoginDeviceAdapter.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32684a;

        public final void a(int i) {
            a aVar;
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f32684a, false, 20850, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f32684a, false, 20850, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            LoginDeviceManagerFragment loginDeviceManagerFragment = LoginDeviceManagerFragment.this;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, loginDeviceManagerFragment, LoginDeviceManagerFragment.f32675a, false, 20837, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, loginDeviceManagerFragment, LoginDeviceManagerFragment.f32675a, false, 20837, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (loginDeviceManagerFragment.getContext() != null) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, loginDeviceManagerFragment, LoginDeviceManagerFragment.f32675a, false, 20840, new Class[]{Integer.TYPE}, a.class)) {
                    aVar = (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, loginDeviceManagerFragment, LoginDeviceManagerFragment.f32675a, false, 20840, new Class[]{Integer.TYPE}, a.class);
                } else {
                    if (loginDeviceManagerFragment.f32676b != null) {
                        List data = loginDeviceManagerFragment.f32676b.getData();
                        if (!CollectionUtils.isEmpty(data) && i2 >= 0 && i2 < data.size()) {
                            aVar = (a) data.get(i2);
                        }
                    }
                    aVar = null;
                }
                if (aVar != null) {
                    if (TextUtils.isEmpty(aVar.f32662a) || !aVar.f32662a.equals(AppLog.getServerDeviceId())) {
                        AlertDialog.Builder a2 = p.a(loginDeviceManagerFragment.getContext());
                        a2.setTitle((CharSequence) aVar.f32664c).setNegativeButton((int) C0906R.string.oy, (DialogInterface.OnClickListener) null).setPositiveButton((int) C0906R.string.b81, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(aVar) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f32686a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ a f32687b;

                            {
                                this.f32687b = r2;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                String str;
                                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32686a, false, 20851, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32686a, false, 20851, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                LoginDeviceManagerFragment loginDeviceManagerFragment = LoginDeviceManagerFragment.this;
                                String str2 = this.f32687b.f32662a;
                                if (PatchProxy.isSupport(new Object[]{str2}, loginDeviceManagerFragment, LoginDeviceManagerFragment.f32675a, false, 20838, new Class[]{String.class}, Void.TYPE)) {
                                    Object[] objArr = {str2};
                                    LoginDeviceManagerFragment loginDeviceManagerFragment2 = loginDeviceManagerFragment;
                                    ChangeQuickRedirect changeQuickRedirect = LoginDeviceManagerFragment.f32675a;
                                    PatchProxy.accessDispatch(objArr, loginDeviceManagerFragment2, changeQuickRedirect, false, 20838, new Class[]{String.class}, Void.TYPE);
                                    return;
                                }
                                AlertDialog.Builder a2 = p.a(loginDeviceManagerFragment.getContext());
                                if (PatchProxy.isSupport(new Object[0], loginDeviceManagerFragment, LoginDeviceManagerFragment.f32675a, false, 20839, new Class[0], String.class)) {
                                    str = (String) PatchProxy.accessDispatch(new Object[0], loginDeviceManagerFragment, LoginDeviceManagerFragment.f32675a, false, 20839, new Class[0], String.class);
                                } else if (loginDeviceManagerFragment.getContext() == null) {
                                    str = "";
                                } else if (!b.a().b() || !com.ss.android.ugc.aweme.account.b.a.a()) {
                                    str = loginDeviceManagerFragment.getString(C0906R.string.b9d);
                                } else {
                                    str = loginDeviceManagerFragment.getString(C0906R.string.b7x);
                                }
                                a2.setMessage((CharSequence) str).setNegativeButton((int) C0906R.string.oy, (DialogInterface.OnClickListener) null).setPositiveButton((int) C0906R.string.b7y, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(str2) {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f32689a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ String f32690b;

                                    {
                                        this.f32690b = r2;
                                    }

                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32689a, false, 20852, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32689a, false, 20852, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                            return;
                                        }
                                        try {
                                            LoginDeviceManagerFragment.this.f32678d.a(this.f32690b, (c) new c() {

                                                /* renamed from: c  reason: collision with root package name */
                                                public static ChangeQuickRedirect f32692c;

                                                public final /* synthetic */ void g(BaseApiResponse baseApiResponse) {
                                                    com.bytedance.sdk.account.api.c.c cVar = (com.bytedance.sdk.account.api.c.c) baseApiResponse;
                                                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f32692c, false, 20853, new Class[]{com.bytedance.sdk.account.api.c.c.class}, Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f32692c, false, 20853, new Class[]{com.bytedance.sdk.account.api.c.c.class}, Void.TYPE);
                                                        return;
                                                    }
                                                    com.ss.android.ugc.aweme.account.terminal.c.a(0, 0, "");
                                                    LoginDeviceManagerFragment.this.a();
                                                    LoginDeviceManagerFragment loginDeviceManagerFragment = LoginDeviceManagerFragment.this;
                                                    if (PatchProxy.isSupport(new Object[0], loginDeviceManagerFragment, LoginDeviceManagerFragment.f32675a, false, 20841, new Class[0], Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[0], loginDeviceManagerFragment, LoginDeviceManagerFragment.f32675a, false, 20841, new Class[0], Void.TYPE);
                                                        return;
                                                    }
                                                    if (loginDeviceManagerFragment.getContext() != null && loginDeviceManagerFragment.isViewValid() && com.ss.android.ugc.aweme.account.b.a.a() && !loginDeviceManagerFragment.f32677c) {
                                                        loginDeviceManagerFragment.f32677c = true;
                                                        AlertDialog.Builder a2 = p.a(loginDeviceManagerFragment.getContext());
                                                        a2.setMessage((CharSequence) loginDeviceManagerFragment.getString(C0906R.string.b7x)).setNegativeButton((int) C0906R.string.oy, (DialogInterface.OnClickListener) null).setPositiveButton((int) C0906R.string.b7w, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                                            /* renamed from: a  reason: collision with root package name */
                                                            public static ChangeQuickRedirect f32694a;

                                                            public final void onClick(DialogInterface dialogInterface, int i) {
                                                                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32694a, false, 20856, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                                                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32694a, false, 20856, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                                                    return;
                                                                }
                                                                LoginDeviceManagerFragment loginDeviceManagerFragment = LoginDeviceManagerFragment.this;
                                                                if (PatchProxy.isSupport(new Object[0], loginDeviceManagerFragment, LoginDeviceManagerFragment.f32675a, false, 20842, new Class[0], Void.TYPE)) {
                                                                    PatchProxy.accessDispatch(new Object[0], loginDeviceManagerFragment, LoginDeviceManagerFragment.f32675a, false, 20842, new Class[0], Void.TYPE);
                                                                    return;
                                                                }
                                                                if (loginDeviceManagerFragment.getContext() != null && loginDeviceManagerFragment.isViewValid()) {
                                                                    loginDeviceManagerFragment.getContext().startActivity(new Intent(loginDeviceManagerFragment.getContext(), BindMobileActivity.class));
                                                                }
                                                            }
                                                        });
                                                        a2.show();
                                                    }
                                                }

                                                public final /* synthetic */ void a(BaseApiResponse baseApiResponse, int i) {
                                                    com.bytedance.sdk.account.api.c.c cVar = (com.bytedance.sdk.account.api.c.c) baseApiResponse;
                                                    if (PatchProxy.isSupport(new Object[]{cVar, Integer.valueOf(i)}, this, f32692c, false, 20854, new Class[]{com.bytedance.sdk.account.api.c.c.class, Integer.TYPE}, Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[]{cVar, Integer.valueOf(i)}, this, f32692c, false, 20854, new Class[]{com.bytedance.sdk.account.api.c.c.class, Integer.TYPE}, Void.TYPE);
                                                        return;
                                                    }
                                                    com.ss.android.ugc.aweme.account.terminal.c.a(1, cVar.error, cVar.errorMsg);
                                                    if (cVar.error == 1039) {
                                                        AlertDialog.Builder a2 = p.a(LoginDeviceManagerFragment.this.getContext());
                                                        a2.setTitle((int) C0906R.string.dqu).setNegativeButton((int) C0906R.string.oy, (DialogInterface.OnClickListener) null).setPositiveButton((int) C0906R.string.dqs, (DialogInterface.OnClickListener) new a(this));
                                                        a2.show();
                                                        return;
                                                    }
                                                    LoginDeviceManagerFragment.this.a((int) C0906R.string.b82);
                                                }
                                            });
                                        } catch (NumberFormatException unused) {
                                        }
                                    }
                                });
                                a2.show();
                            }
                        });
                        a2.show();
                    } else {
                        loginDeviceManagerFragment.a((int) C0906R.string.b80);
                    }
                }
            }
        }
    };

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f32675a, false, 20835, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32675a, false, 20835, new Class[0], Void.TYPE);
            return;
        }
        this.f32678d.a((com.bytedance.sdk.account.api.a.d) new com.bytedance.sdk.account.api.a.d() {

            /* renamed from: c  reason: collision with root package name */
            public static ChangeQuickRedirect f32681c;

            public final /* synthetic */ void g(BaseApiResponse baseApiResponse) {
                com.bytedance.sdk.account.api.c.d dVar = (com.bytedance.sdk.account.api.c.d) baseApiResponse;
                if (PatchProxy.isSupport(new Object[]{dVar}, this, f32681c, false, 20848, new Class[]{com.bytedance.sdk.account.api.c.d.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dVar}, this, f32681c, false, 20848, new Class[]{com.bytedance.sdk.account.api.c.d.class}, Void.TYPE);
                    return;
                }
                if (LoginDeviceManagerFragment.this.isViewValid()) {
                    List linkedList = new LinkedList();
                    LoginDeviceManagerFragment.this.b();
                    try {
                        if (dVar.f22245a != null) {
                            linkedList = (List) new Gson().fromJson(new JSONObject(dVar.f22245a.toString()).optString("data"), new TypeToken<List<a>>() {
                            }.getType());
                        }
                    } catch (JSONException unused) {
                    }
                    if (!CollectionUtils.isEmpty(linkedList)) {
                        LoginDeviceManagerFragment.this.a(linkedList);
                    }
                }
            }

            public final /* synthetic */ void a(BaseApiResponse baseApiResponse, int i) {
                com.bytedance.sdk.account.api.c.d dVar = (com.bytedance.sdk.account.api.c.d) baseApiResponse;
                if (PatchProxy.isSupport(new Object[]{dVar, Integer.valueOf(i)}, this, f32681c, false, 20849, new Class[]{com.bytedance.sdk.account.api.c.d.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dVar, Integer.valueOf(i)}, this, f32681c, false, 20849, new Class[]{com.bytedance.sdk.account.api.c.d.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                LoginDeviceManagerFragment.this.a((int) C0906R.string.b85);
                LoginDeviceManagerFragment.this.b();
            }
        });
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f32675a, false, 20847, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32675a, false, 20847, new Class[0], Void.TYPE);
            return;
        }
        if (this.f32679e != null) {
            this.f32679e.setVisibility(4);
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f32675a, false, 20844, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f32675a, false, 20844, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (getContext() != null && isViewValid()) {
            com.bytedance.ies.dmt.ui.d.a.c(getContext(), getString(i)).a();
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f32675a, false, 20836, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f32675a, false, 20836, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view.getId() == C0906R.id.ix && getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    public final void a(List<a> list) {
        List<a> list2;
        int i;
        if (PatchProxy.isSupport(new Object[]{list}, this, f32675a, false, 20843, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f32675a, false, 20843, new Class[]{List.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(list) && this.f32676b != null) {
            LoginDeviceAdapter loginDeviceAdapter = this.f32676b;
            if (PatchProxy.isSupport(new Object[]{list}, this, f32675a, false, 20845, new Class[]{List.class}, List.class)) {
                list2 = (List) PatchProxy.accessDispatch(new Object[]{list}, this, f32675a, false, 20845, new Class[]{List.class}, List.class);
            } else {
                if (!PatchProxy.isSupport(new Object[]{list}, this, f32675a, false, 20846, new Class[]{List.class}, Integer.TYPE)) {
                    i = 0;
                    while (true) {
                        if (i >= list.size()) {
                            i = -1;
                            break;
                        }
                        a aVar = list.get(i);
                        if (aVar != null) {
                            String str = aVar.f32662a;
                            if (!TextUtils.isEmpty(str) && str.equals(AppLog.getServerDeviceId())) {
                                break;
                            }
                        }
                        i++;
                    }
                } else {
                    i = ((Integer) PatchProxy.accessDispatch(new Object[]{list}, this, f32675a, false, 20846, new Class[]{List.class}, Integer.TYPE)).intValue();
                }
                if (i >= 0) {
                    list.remove(i);
                    list.add(0, list.get(i));
                }
                list2 = list;
            }
            loginDeviceAdapter.setData(list2);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f32675a, false, 20830, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f32675a, false, 20830, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f32678d = com.bytedance.sdk.account.d.d.a(getContext());
        if (PatchProxy.isSupport(new Object[]{view}, this, f32675a, false, 20831, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f32675a, false, 20831, new Class[]{View.class}, Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[]{view}, this, f32675a, false, 20833, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f32675a, false, 20833, new Class[]{View.class}, Void.TYPE);
            } else {
                ((TextView) view.findViewById(C0906R.id.title)).setText(C0906R.string.b88);
                ((ImageView) view.findViewById(C0906R.id.ix)).setOnClickListener(this);
            }
            if (PatchProxy.isSupport(new Object[]{view}, this, f32675a, false, 20834, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f32675a, false, 20834, new Class[]{View.class}, Void.TYPE);
            } else {
                RecyclerView recyclerView = (RecyclerView) view.findViewById(C0906R.id.a4c);
                this.f32676b = new LoginDeviceAdapter(getContext());
                this.f32676b.setShowFooter(false);
                this.f32676b.f32668c = this.f32680f;
                recyclerView.setAdapter(this.f32676b);
                recyclerView.setLayoutManager(new WrapLinearLayoutManager(getContext(), 1, false));
            }
            if (PatchProxy.isSupport(new Object[]{view}, this, f32675a, false, 20832, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f32675a, false, 20832, new Class[]{View.class}, Void.TYPE);
            } else {
                this.f32679e = (DmtStatusView) view.findViewById(C0906R.id.cvd);
                this.f32679e.setBuilder(DmtStatusView.a.a(getContext()));
                this.f32679e.d();
            }
        }
        a();
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f32675a, false, 20829, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.oj, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f32675a, false, 20829, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}

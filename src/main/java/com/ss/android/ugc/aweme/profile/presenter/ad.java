package com.ss.android.ugc.aweme.profile.presenter;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Map;

public class ad implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61573a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f61574b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f61575c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f61576d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f61577e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f61578f = false;
    public WeakHandler g = new WeakHandler(this);
    public r h;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f61573a, false, 67636, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f61573a, false, 67636, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!this.o) {
            this.o = true;
            d.a().updateSecret(this.g, z);
        }
    }

    public final void a(Map<String, String> map) {
        if (PatchProxy.isSupport(new Object[]{map}, this, f61573a, false, 67638, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map}, this, f61573a, false, 67638, new Class[]{Map.class}, Void.TYPE);
        } else if (map != null && map.size() != 0 && !this.f61574b) {
            this.f61574b = true;
            d.a().updateUserInfo(this.g, map);
        }
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f61573a, false, 67639, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f61573a, false, 67639, new Class[]{String.class}, Void.TYPE);
        } else if (!this.k) {
            this.k = true;
            d.a().updateSignature(this.g, str);
        }
    }

    public final void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f61573a, false, 67641, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f61573a, false, 67641, new Class[]{String.class}, Void.TYPE);
        } else if (!this.l) {
            this.l = true;
            d.a().updateAvatarUri(this.g, str);
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f61573a, false, 67630, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f61573a, false, 67630, new Class[]{Message.class}, Void.TYPE);
        } else if (message.obj instanceof Exception) {
            Exception exc = (Exception) message.obj;
            int i2 = message.what;
            if (PatchProxy.isSupport(new Object[]{exc, Integer.valueOf(i2)}, this, f61573a, false, 67632, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{exc, Integer.valueOf(i2)}, this, f61573a, false, 67632, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i2 == 112) {
                this.f61574b = false;
            } else if (i2 == 116) {
                this.f61576d = false;
            } else if (i2 != 122) {
                switch (i2) {
                    case 0:
                        this.j = false;
                        break;
                    case 1:
                        this.i = false;
                        break;
                    case 2:
                        this.k = false;
                        break;
                    case 3:
                        this.f61575c = false;
                        break;
                    case 4:
                        this.l = false;
                        break;
                    case 5:
                        this.n = false;
                        break;
                    default:
                        switch (i2) {
                            case e.l:
                                this.f61577e = false;
                                break;
                            case 8:
                                this.f61578f = false;
                                break;
                            case 9:
                                this.p = false;
                                break;
                            case 10:
                                this.m = false;
                                break;
                        }
                }
            } else {
                this.o = false;
            }
            if (this.h != null) {
                this.h.a(exc, i2);
                if (!this.l && !this.f61575c && !this.i && !this.j && !this.k && !this.f61576d && !this.f61574b && !this.o && !this.m) {
                    this.h.a(false);
                }
            }
        } else if (message.obj instanceof User) {
            a((User) message.obj, message.what);
        } else {
            if (message.obj instanceof UserResponse) {
                UserResponse userResponse = (UserResponse) message.obj;
                if (userResponse.getAction() == 1) {
                    a(userResponse.status_msg, true);
                } else if (userResponse.getAction() == 2) {
                    a(userResponse.status_msg, false);
                } else {
                    a(userResponse.getUser(), message.what);
                }
            }
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f61573a, false, 67637, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f61573a, false, 67637, new Class[]{String.class}, Void.TYPE);
        } else if (!this.j) {
            this.j = true;
            d.a().updateNickName(this.g, str);
        }
    }

    private void a(String str, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f61573a, false, 67631, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f61573a, false, 67631, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f61574b = false;
        this.j = false;
        if (this.h != null) {
            this.h.a(str, z);
        }
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f61573a, false, 67640, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f61573a, false, 67640, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (!this.i) {
            this.i = true;
            HashMap hashMap = new HashMap();
            hashMap.put("show_gender_strategy", String.valueOf(i3));
            hashMap.put("gender", String.valueOf(i2));
            d.a().updateGender(this.g, hashMap);
        }
    }

    private void a(User user, int i2) {
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i2)}, this, f61573a, false, 67633, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i2)}, this, f61573a, false, 67633, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
        } else if (user != null) {
            if (i2 == 112) {
                if (a.b()) {
                    UrlModel avatarVideoUri = user.getAvatarVideoUri();
                    if (!(avatarVideoUri == null || avatarVideoUri.getUrlList() == null || avatarVideoUri.getUrlList().size() <= 0)) {
                        d.a().getCurUser().setAvatarUpdateReminder(false);
                    }
                }
                this.f61574b = false;
                d.a().updateCurUser(user);
            } else if (i2 == 116) {
                if (a.a()) {
                    d.a().getCurUser().setNicknameUpdateReminder(false);
                }
                this.f61576d = false;
                d.a().updateCurUserId(user.getUniqueId());
            } else if (i2 != 122) {
                switch (i2) {
                    case 0:
                        if (!a.a()) {
                            d.a().getCurUser().setNicknameUpdateReminder(false);
                        }
                        this.j = false;
                        d.a().updateCurNickname(user.getNickname());
                        break;
                    case 1:
                        this.i = false;
                        d.a().updateCurGender(user.getShowGenderStrategy(), user.getGender());
                        break;
                    case 2:
                        this.k = false;
                        d.a().updateCurSignature(user.getSignature());
                        break;
                    case 3:
                        this.f61575c = false;
                        d.a().updateCurBirthday(user.getBirthday(), user.getBirthdayHideLevel());
                        break;
                    case 4:
                        d.a().getCurUser().setAvatarUpdateReminder(false);
                        this.l = false;
                        d.a().updateCurAvatar(user.getAvatarThumb(), user.getAvatarMedium(), user.getAvatarLarger());
                        break;
                    case 5:
                        this.n = false;
                        d.a().updateCurAllowStatus(user.getAllowStatus());
                        break;
                    default:
                        switch (i2) {
                            case e.l:
                                break;
                            case 8:
                                this.f61578f = false;
                                break;
                            case 9:
                                this.p = false;
                                break;
                            case 10:
                                this.m = false;
                                d.a().updateCurCover(user.getCoverUrls());
                                break;
                        }
                }
                this.f61577e = false;
            } else {
                this.o = false;
                d.a().updateCurSecret(user.isSecret());
            }
            if (this.h != null) {
                this.h.a(user, i2);
                if (!this.l && !this.f61575c && !this.i && !this.j && !this.k && !this.f61576d && !this.f61574b && !this.o && !this.m) {
                    this.h.a(true);
                }
            }
        }
    }

    public final void a(String str, int i2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, this, f61573a, false, 67642, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2)}, this, f61573a, false, 67642, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
        } else if (!this.m) {
            this.m = true;
            d.a().updateCoverUri(this.g, str, i2);
        }
    }
}

package com.ss.android.ugc.aweme.challenge.data;

import android.arch.persistence.room.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.e.c;
import com.ss.android.ugc.aweme.app.i;
import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35397a = null;

    /* renamed from: b  reason: collision with root package name */
    public static c<LocalHashTagDataBase> f35398b = new c<LocalHashTagDataBase>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35400a;

        public final /* synthetic */ Object a() {
            if (!PatchProxy.isSupport(new Object[0], this, f35400a, false, 25828, new Class[0], LocalHashTagDataBase.class)) {
                return (LocalHashTagDataBase) Room.databaseBuilder(i.a().getContext(), LocalHashTagDataBase.class, "localHashTag.db").allowMainThreadQueries().build();
            }
            return (LocalHashTagDataBase) PatchProxy.accessDispatch(new Object[0], this, f35400a, false, 25828, new Class[0], LocalHashTagDataBase.class);
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private static final String f35399c = "d";

    public static List<c> a() {
        if (PatchProxy.isSupport(new Object[0], null, f35397a, true, 25826, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], null, f35397a, true, 25826, new Class[0], List.class);
        }
        try {
            LocalHashTagDataBase localHashTagDataBase = (LocalHashTagDataBase) f35398b.b();
            if (localHashTagDataBase != null) {
                return localHashTagDataBase.a().a();
            }
        } catch (Exception unused) {
        }
        return null;
    }
}

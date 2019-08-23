package com.ss.android.ugc.aweme.crossplatform.base;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;

public final class SystemPrintHookTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public final f type() {
        return f.BOOT_FINISH;
    }

    public final void run(@NotNull Context context) {
        Field field;
        Field field2;
        Field field3;
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 34213, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 34213, new Class[]{Context.class}, Void.TYPE);
        } else if (!a.a()) {
            System.err.println("err before");
            System.out.println("out before");
            try {
                field = System.class.getField("err");
                field2 = System.class.getField("out");
                field.setAccessible(true);
                field2.setAccessible(true);
                field3 = Field.class.getDeclaredField("accessFlags");
            } catch (NoSuchFieldException unused) {
                field3 = Field.class.getDeclaredField("modifiers");
            } catch (Throwable unused2) {
            }
            field3.setAccessible(true);
            field3.setInt(field, field.getModifiers() & -17);
            field3.setInt(field2, field2.getModifiers() & -17);
            try {
                PrintStream printStream = new PrintStream(new OutputStream() {
                    public final void write(int i) {
                    }
                });
                field.set(null, printStream);
                field2.set(null, printStream);
            } catch (Throwable unused3) {
            }
            System.err.println("err after");
            System.out.println("out after");
        }
    }
}

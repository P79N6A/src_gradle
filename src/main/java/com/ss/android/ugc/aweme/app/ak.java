package com.ss.android.ugc.aweme.app;

import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.a;
import com.ss.android.http.a.a.b;
import com.ss.android.http.a.e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.conn.ConnectTimeoutException;

public final class ak {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33761a;

    public static int a(Throwable th, String[] strArr) {
        int i;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2, strArr}, null, f33761a, true, 22570, new Class[]{Throwable.class, String[].class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{th2, strArr}, null, f33761a, true, 22570, new Class[]{Throwable.class, String[].class}, Integer.TYPE)).intValue();
        } else if (th2 == null) {
            return 1;
        } else {
            if (th2 instanceof b) {
                i = ((b) th2).getStatusCode();
            } else if (th2 instanceof a) {
                i = 20;
            } else {
                if (!(th2 instanceof ConnectTimeoutException)) {
                    if (th2 instanceof SocketTimeoutException) {
                        if (StringUtils.isEmpty(th.getMessage()) || !th.getMessage().contains("connect timed out")) {
                            i = 3;
                        }
                    } else if (th2 instanceof BindException) {
                        i = 7;
                    } else if (th2 instanceof ConnectException) {
                        i = 8;
                    } else if (th2 instanceof NoRouteToHostException) {
                        i = 9;
                    } else if (th2 instanceof PortUnreachableException) {
                        i = 10;
                    } else if (th2 instanceof SocketException) {
                        i = 5;
                        String message = th.getMessage();
                        if (message != null && message.indexOf("reset by peer") >= 0) {
                            i = 6;
                        }
                    } else {
                        i = th2 instanceof UnknownHostException ? 11 : th2 instanceof e ? 18 : th2 instanceof com.ss.android.http.a.a.a ? 19 : th2 instanceof IOException ? 4 : 1;
                    }
                }
                i = 2;
            }
            if (i == 2) {
                try {
                    String message2 = th.getMessage();
                    Logger.debug();
                    Matcher matcher = Pattern.compile("Connect to +([\\w\\.\\-]+)?/(\\[([a-zA-Z0-9:]+)\\]|(\\d{1,3}(\\.\\d{1,3}){3,3})):(\\d+) +timed out").matcher(message2);
                    if (matcher.matches()) {
                        if (matcher.group(3) != null) {
                            strArr[0] = matcher.group(3);
                        } else if (matcher.group(4) != null) {
                            strArr[0] = matcher.group(4);
                        }
                    }
                    Logger.debug();
                } catch (Exception unused) {
                }
            } else if (i == 8) {
                Throwable cause = th.getCause();
                if (cause != null && (cause instanceof ConnectException)) {
                    String message3 = cause.getMessage();
                    Logger.debug();
                    Matcher matcher2 = Pattern.compile("failed to connect to +([\\w\\.\\-]+)?/(\\[([a-zA-Z0-9:]+)\\]|(\\d{1,3}(\\.\\d{1,3}){3,3})) \\(port \\d+\\)( +after \\d+ms)?: +\\w+ failed: (E[A-Z]+) .*").matcher(message3);
                    if (matcher2.matches()) {
                        if (matcher2.group(3) != null) {
                            strArr[0] = matcher2.group(3);
                        } else if (matcher2.group(4) != null) {
                            strArr[0] = matcher2.group(4);
                        }
                        String group = matcher2.group(7);
                        if (group != null) {
                            if ("ECONNRESET".equals(group)) {
                                i = 12;
                            } else if ("ECONNREFUSED".equals(group)) {
                                i = 13;
                            } else if ("EHOSTUNREACH".equals(group)) {
                                i = 14;
                            } else if ("ENETUNREACH".equals(group)) {
                                i = 15;
                            } else if ("EADDRNOTAVAIL".equals(group)) {
                                i = 16;
                            } else if ("EADDRINUSE".equals(group)) {
                                i = 17;
                            }
                        }
                    }
                    Logger.debug();
                }
            } else if (i == 4) {
                String message4 = th.getMessage();
                if (message4.indexOf(" EIO (I/O error)") > 0) {
                    i = 37;
                } else {
                    if (!(th2 instanceof FileNotFoundException) && message4.indexOf(" ENOENT ") <= 0) {
                        if (message4.indexOf("No such file or directory") <= 0) {
                            if (message4.indexOf(" ENOSPC ") <= 0) {
                                if (message4.indexOf("No space left on device") <= 0) {
                                    if (message4.indexOf(" EDQUOT ") > 0) {
                                        i = 34;
                                    } else if (message4.indexOf(" EROFS ") > 0) {
                                        i = 35;
                                    } else if (message4.indexOf(" EACCES ") > 0) {
                                        i = 36;
                                    }
                                }
                            }
                            i = 32;
                        }
                    }
                    i = 33;
                }
            }
            return i;
        }
    }
}

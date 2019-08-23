package com.ali.auth.third.core.message;

import android.content.Context;
import com.ali.auth.third.core.context.KernelContext;
import com.ali.auth.third.core.trace.SDKLogger;
import com.ali.auth.third.core.util.ResourceUtils;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MessageUtils {

    /* renamed from: a  reason: collision with root package name */
    private static Map<Integer, Message> f4927a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static ReentrantReadWriteLock f4928b = new ReentrantReadWriteLock();

    /* renamed from: c  reason: collision with root package name */
    private static final Message f4929c;

    /* renamed from: d  reason: collision with root package name */
    private static final Message f4930d;

    /* renamed from: e  reason: collision with root package name */
    private static Message f4931e;

    /* renamed from: f  reason: collision with root package name */
    private static Message f4932f;
    private static final Object g = new Object();

    static {
        Message message = new Message();
        f4929c = message;
        message.code = 1;
        f4929c.message = "未在消息文件中找到 id 为 {0} 的消息";
        f4929c.action = "请检查所依赖的 SDK 项目，或若是手动拷贝 SDK 至当前开发应用所在项目，请检查是否漏拷文件 res/values 下文件";
        f4929c.type = "E";
        Message message2 = new Message();
        f4930d = message2;
        message2.code = 2;
        f4930d.message = "检索消息时发生如下错误 {0}";
        f4930d.action = "请检查所依赖的 SDK 项目，或若是手动拷贝 SDK 至当前开发应用所在项目，请检查是否漏拷文件 res/values 下文件";
        f4930d.type = "E";
    }

    private static Message a(int i) {
        if (f4931e == null) {
            synchronized (g) {
                if (f4931e == null) {
                    Message b2 = b(1);
                    f4931e = b2;
                    if (b2 == null) {
                        f4931e = f4929c;
                    }
                }
            }
        }
        try {
            Message message = (Message) f4931e.clone();
            message.message = MessageFormat.format(message.message, new Object[]{String.valueOf(i)});
            return message;
        } catch (CloneNotSupportedException unused) {
            return f4931e;
        }
    }

    private static Message a(String str) {
        if (f4932f == null) {
            synchronized (g) {
                if (f4932f == null) {
                    Message b2 = b(2);
                    f4932f = b2;
                    if (b2 == null) {
                        f4932f = f4930d;
                    }
                }
            }
        }
        try {
            Message message = (Message) f4932f.clone();
            message.message = MessageFormat.format(message.message, new Object[]{str});
            return message;
        } catch (CloneNotSupportedException unused) {
            return f4932f;
        }
    }

    private static Message b(int i) {
        try {
            Context applicationContext = KernelContext.getApplicationContext();
            int identifier = ResourceUtils.getIdentifier(applicationContext, "string", "auth_sdk_message_" + i + "_message");
            if (identifier == 0) {
                return null;
            }
            Message message = new Message();
            message.code = i;
            message.message = KernelContext.getApplicationContext().getResources().getString(identifier);
            Context applicationContext2 = KernelContext.getApplicationContext();
            int identifier2 = ResourceUtils.getIdentifier(applicationContext2, "string", "auth_sdk_message_" + i + "_action");
            message.action = identifier2 != 0 ? KernelContext.getApplicationContext().getResources().getString(identifier2) : "";
            Context applicationContext3 = KernelContext.getApplicationContext();
            int identifier3 = ResourceUtils.getIdentifier(applicationContext3, "string", "auth_sdk_message_" + i + "_type");
            message.type = identifier3 != 0 ? KernelContext.getApplicationContext().getResources().getString(identifier3) : "I";
            return message;
        } catch (Exception e2) {
            SDKLogger.e("kernel", "Fail to get message of the code " + i + ", the error message is " + e2.getMessage());
            return null;
        }
    }

    public static Message createMessage(int i, Object... objArr) {
        try {
            f4928b.readLock().lock();
            Message message = f4927a.get(Integer.valueOf(i));
            if (message == null) {
                f4928b.readLock().unlock();
                f4928b.writeLock().lock();
                message = b(i);
                if (message != null) {
                    f4927a.put(Integer.valueOf(i), message);
                }
                f4928b.readLock().lock();
                f4928b.writeLock().unlock();
            }
            if (message == null) {
                Message a2 = a(i);
                f4928b.readLock().unlock();
                return a2;
            } else if (objArr.length == 0) {
                f4928b.readLock().unlock();
                return message;
            } else {
                Message message2 = (Message) message.clone();
                message2.message = MessageFormat.format(message.message, objArr);
                f4928b.readLock().unlock();
                return message2;
            }
        } catch (Exception e2) {
            return a(e2.getMessage());
        } catch (Throwable th) {
            f4928b.writeLock().unlock();
            throw th;
        }
    }

    public static String getMessageContent(int i, Object... objArr) {
        try {
            f4928b.readLock().lock();
            Message message = f4927a.get(Integer.valueOf(i));
            if (message == null) {
                f4928b.readLock().unlock();
                f4928b.writeLock().lock();
                message = b(i);
                if (message != null) {
                    f4927a.put(Integer.valueOf(i), message);
                }
                f4928b.readLock().lock();
                f4928b.writeLock().unlock();
            }
            if (message == null) {
                String str = a(i).message;
                f4928b.readLock().unlock();
                return str;
            }
            String format = MessageFormat.format(message.message, objArr);
            f4928b.readLock().unlock();
            return format;
        } catch (Exception e2) {
            return a(e2.getMessage()).message;
        } catch (Throwable th) {
            f4928b.writeLock().unlock();
            throw th;
        }
    }
}

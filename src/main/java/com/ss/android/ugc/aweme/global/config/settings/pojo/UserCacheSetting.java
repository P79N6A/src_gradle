package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.KtNullable;
import com.bytedance.ies.c.a;
import com.bytedance.ies.c.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UserCacheSetting extends Message<UserCacheSetting, Builder> {
    public static final DefaultValueProtoAdapter<UserCacheSetting> ADAPTER = new ProtoAdapter_UserCacheSetting();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer enable_ru_cache;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer enable_ru_insert;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long ru_cache_intervals;

    public static final class Builder extends Message.Builder<UserCacheSetting, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Integer enable_ru_cache;
        public Integer enable_ru_insert;
        public Long ru_cache_intervals;

        public final UserCacheSetting build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49364, new Class[0], UserCacheSetting.class)) {
                return new UserCacheSetting(this.enable_ru_cache, this.enable_ru_insert, this.ru_cache_intervals, super.buildUnknownFields());
            }
            return (UserCacheSetting) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49364, new Class[0], UserCacheSetting.class);
        }

        public final Builder enable_ru_cache(Integer num) {
            this.enable_ru_cache = num;
            return this;
        }

        public final Builder enable_ru_insert(Integer num) {
            this.enable_ru_insert = num;
            return this;
        }

        public final Builder ru_cache_intervals(Long l) {
            this.ru_cache_intervals = l;
            return this;
        }
    }

    static final class ProtoAdapter_UserCacheSetting extends DefaultValueProtoAdapter<UserCacheSetting> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final UserCacheSetting redact(UserCacheSetting userCacheSetting) {
            return userCacheSetting;
        }

        public ProtoAdapter_UserCacheSetting() {
            super(FieldEncoding.LENGTH_DELIMITED, UserCacheSetting.class);
        }

        public final UserCacheSetting decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49367, new Class[]{ProtoReader.class}, UserCacheSetting.class)) {
                return decode(protoReader2, (UserCacheSetting) null);
            }
            return (UserCacheSetting) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49367, new Class[]{ProtoReader.class}, UserCacheSetting.class);
        }

        public final int encodedSize(UserCacheSetting userCacheSetting) {
            UserCacheSetting userCacheSetting2 = userCacheSetting;
            if (!PatchProxy.isSupport(new Object[]{userCacheSetting2}, this, changeQuickRedirect, false, 49365, new Class[]{UserCacheSetting.class}, Integer.TYPE)) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, userCacheSetting2.enable_ru_cache) + ProtoAdapter.INT32.encodedSizeWithTag(2, userCacheSetting2.enable_ru_insert) + ProtoAdapter.INT64.encodedSizeWithTag(3, userCacheSetting2.ru_cache_intervals) + userCacheSetting.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{userCacheSetting2}, this, changeQuickRedirect, false, 49365, new Class[]{UserCacheSetting.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, UserCacheSetting userCacheSetting) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            UserCacheSetting userCacheSetting2 = userCacheSetting;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, userCacheSetting2}, this, changeQuickRedirect, false, 49366, new Class[]{ProtoWriter.class, UserCacheSetting.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, userCacheSetting2}, this, changeQuickRedirect, false, 49366, new Class[]{ProtoWriter.class, UserCacheSetting.class}, Void.TYPE);
                return;
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 1, userCacheSetting2.enable_ru_cache);
            ProtoAdapter.INT32.encodeWithTag(protoWriter2, 2, userCacheSetting2.enable_ru_insert);
            ProtoAdapter.INT64.encodeWithTag(protoWriter2, 3, userCacheSetting2.ru_cache_intervals);
            protoWriter2.writeBytes(userCacheSetting.unknownFields());
        }

        public final UserCacheSetting decode(ProtoReader protoReader, UserCacheSetting userCacheSetting) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            UserCacheSetting userCacheSetting2 = userCacheSetting;
            if (PatchProxy.isSupport(new Object[]{protoReader2, userCacheSetting2}, this, changeQuickRedirect, false, 49368, new Class[]{ProtoReader.class, UserCacheSetting.class}, UserCacheSetting.class)) {
                return (UserCacheSetting) PatchProxy.accessDispatch(new Object[]{protoReader2, userCacheSetting2}, this, changeQuickRedirect, false, 49368, new Class[]{ProtoReader.class, UserCacheSetting.class}, UserCacheSetting.class);
            }
            UserCacheSetting userCacheSetting3 = (UserCacheSetting) a.a().a(UserCacheSetting.class, userCacheSetting2);
            if (userCacheSetting3 != null) {
                builder = userCacheSetting3.newBuilder();
            } else {
                builder = new Builder();
            }
            Builder builder2 = builder;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder2.enable_ru_cache((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 2:
                            builder2.enable_ru_insert((Integer) ProtoAdapter.INT32.decode(protoReader2));
                            break;
                        case 3:
                            builder2.ru_cache_intervals((Long) ProtoAdapter.INT64.decode(protoReader2));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (userCacheSetting3 != null) {
                                    break;
                                } else {
                                    throw e2;
                                }
                            }
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    return builder2.build();
                }
            }
        }
    }

    @KtNullable
    public final Integer getEnableRuCache() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49357, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49357, new Class[0], Integer.class);
        } else if (this.enable_ru_cache != null) {
            return this.enable_ru_cache;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Integer getEnableRuInsert() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49358, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49358, new Class[0], Integer.class);
        } else if (this.enable_ru_insert != null) {
            return this.enable_ru_insert;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    @KtNullable
    public final Long getRuCacheIntervals() throws com.bytedance.ies.a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49359, new Class[0], Long.class)) {
            return (Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49359, new Class[0], Long.class);
        } else if (this.ru_cache_intervals != null) {
            return this.ru_cache_intervals;
        } else {
            throw new com.bytedance.ies.a();
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49362, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49362, new Class[0], Integer.TYPE)).intValue();
        }
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            if (this.enable_ru_cache != null) {
                i = this.enable_ru_cache.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 37;
            if (this.enable_ru_insert != null) {
                i2 = this.enable_ru_insert.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            if (this.ru_cache_intervals != null) {
                i3 = this.ru_cache_intervals.hashCode();
            }
            i4 = i6 + i3;
            this.hashCode = i4;
        }
        return i4;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49360, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49360, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.enable_ru_cache = this.enable_ru_cache;
        builder.enable_ru_insert = this.enable_ru_insert;
        builder.ru_cache_intervals = this.ru_cache_intervals;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49363, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49363, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (this.enable_ru_cache != null) {
            sb.append(", enable_ru_cache=");
            sb.append(this.enable_ru_cache);
        }
        if (this.enable_ru_insert != null) {
            sb.append(", enable_ru_insert=");
            sb.append(this.enable_ru_insert);
        }
        if (this.ru_cache_intervals != null) {
            sb.append(", ru_cache_intervals=");
            sb.append(this.ru_cache_intervals);
        }
        StringBuilder replace = sb.replace(0, 2, "UserCacheSetting{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49361, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49361, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof UserCacheSetting)) {
                return false;
            }
            UserCacheSetting userCacheSetting = (UserCacheSetting) obj;
            if (!unknownFields().equals(userCacheSetting.unknownFields()) || !Internal.equals(this.enable_ru_cache, userCacheSetting.enable_ru_cache) || !Internal.equals(this.enable_ru_insert, userCacheSetting.enable_ru_insert) || !Internal.equals(this.ru_cache_intervals, userCacheSetting.ru_cache_intervals)) {
                return false;
            }
            return true;
        }
    }

    public UserCacheSetting(Integer num, Integer num2, Long l) {
        this(num, num2, l, ByteString.EMPTY);
    }

    public UserCacheSetting(Integer num, Integer num2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enable_ru_cache = num;
        this.enable_ru_insert = num2;
        this.ru_cache_intervals = l;
    }
}

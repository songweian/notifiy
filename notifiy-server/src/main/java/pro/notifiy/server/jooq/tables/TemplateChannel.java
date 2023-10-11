/*
 * This file is generated by jOOQ.
 */
package pro.notifiy.server.jooq.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import pro.notifiy.server.jooq.Keys;
import pro.notifiy.server.jooq.Notify;
import pro.notifiy.server.jooq.tables.records.TemplateChannelRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TemplateChannel extends TableImpl<TemplateChannelRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>notify.template_channel</code>
     */
    public static final TemplateChannel TEMPLATE_CHANNEL = new TemplateChannel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TemplateChannelRecord> getRecordType() {
        return TemplateChannelRecord.class;
    }

    /**
     * The column <code>notify.template_channel.id</code>.
     */
    public final TableField<TemplateChannelRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>notify.template_channel.app_id</code>.
     */
    public final TableField<TemplateChannelRecord, String> APP_ID = createField(DSL.name("app_id"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>notify.template_channel.template_code</code>.
     */
    public final TableField<TemplateChannelRecord, String> TEMPLATE_CODE = createField(DSL.name("template_code"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>notify.template_channel.channel_code</code>.
     */
    public final TableField<TemplateChannelRecord, String> CHANNEL_CODE = createField(DSL.name("channel_code"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>notify.template_channel.create_time</code>.
     */
    public final TableField<TemplateChannelRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>notify.template_channel.update_time</code>.
     */
    public final TableField<TemplateChannelRecord, LocalDateTime> UPDATE_TIME = createField(DSL.name("update_time"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private TemplateChannel(Name alias, Table<TemplateChannelRecord> aliased) {
        this(alias, aliased, null);
    }

    private TemplateChannel(Name alias, Table<TemplateChannelRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>notify.template_channel</code> table reference
     */
    public TemplateChannel(String alias) {
        this(DSL.name(alias), TEMPLATE_CHANNEL);
    }

    /**
     * Create an aliased <code>notify.template_channel</code> table reference
     */
    public TemplateChannel(Name alias) {
        this(alias, TEMPLATE_CHANNEL);
    }

    /**
     * Create a <code>notify.template_channel</code> table reference
     */
    public TemplateChannel() {
        this(DSL.name("template_channel"), null);
    }

    public <O extends Record> TemplateChannel(Table<O> child, ForeignKey<O, TemplateChannelRecord> key) {
        super(child, key, TEMPLATE_CHANNEL);
    }

    @Override
    public Schema getSchema() {
        return Notify.NOTIFY;
    }

    @Override
    public Identity<TemplateChannelRecord, Long> getIdentity() {
        return (Identity<TemplateChannelRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<TemplateChannelRecord> getPrimaryKey() {
        return Keys.KEY_TEMPLATE_CHANNEL_PRIMARY;
    }

    @Override
    public List<UniqueKey<TemplateChannelRecord>> getKeys() {
        return Arrays.<UniqueKey<TemplateChannelRecord>>asList(Keys.KEY_TEMPLATE_CHANNEL_PRIMARY);
    }

    @Override
    public TemplateChannel as(String alias) {
        return new TemplateChannel(DSL.name(alias), this);
    }

    @Override
    public TemplateChannel as(Name alias) {
        return new TemplateChannel(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TemplateChannel rename(String name) {
        return new TemplateChannel(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TemplateChannel rename(Name name) {
        return new TemplateChannel(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}

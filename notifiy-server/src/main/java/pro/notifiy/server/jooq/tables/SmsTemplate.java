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
import org.jooq.Row10;
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
import pro.notifiy.server.jooq.tables.records.SmsTemplateRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmsTemplate extends TableImpl<SmsTemplateRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>notify.sms_template</code>
     */
    public static final SmsTemplate SMS_TEMPLATE = new SmsTemplate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SmsTemplateRecord> getRecordType() {
        return SmsTemplateRecord.class;
    }

    /**
     * The column <code>notify.sms_template.id</code>.
     */
    public final TableField<SmsTemplateRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>notify.sms_template.app_id</code>.
     */
    public final TableField<SmsTemplateRecord, String> APP_ID = createField(DSL.name("app_id"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>notify.sms_template.template_code</code>.
     */
    public final TableField<SmsTemplateRecord, String> TEMPLATE_CODE = createField(DSL.name("template_code"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>notify.sms_template.template_content</code>.
     */
    public final TableField<SmsTemplateRecord, String> TEMPLATE_CONTENT = createField(DSL.name("template_content"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>notify.sms_template.sign_name</code>.
     */
    public final TableField<SmsTemplateRecord, String> SIGN_NAME = createField(DSL.name("sign_name"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>notify.sms_template.default_params</code>.
     */
    public final TableField<SmsTemplateRecord, String> DEFAULT_PARAMS = createField(DSL.name("default_params"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>notify.sms_template.ext_params</code>.
     */
    public final TableField<SmsTemplateRecord, String> EXT_PARAMS = createField(DSL.name("ext_params"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>notify.sms_template.state</code>.
     */
    public final TableField<SmsTemplateRecord, String> STATE = createField(DSL.name("state"), SQLDataType.VARCHAR(10).nullable(false).defaultValue(DSL.inline("INIT", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>notify.sms_template.create_time</code>.
     */
    public final TableField<SmsTemplateRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>notify.sms_template.update_time</code>.
     */
    public final TableField<SmsTemplateRecord, LocalDateTime> UPDATE_TIME = createField(DSL.name("update_time"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private SmsTemplate(Name alias, Table<SmsTemplateRecord> aliased) {
        this(alias, aliased, null);
    }

    private SmsTemplate(Name alias, Table<SmsTemplateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>notify.sms_template</code> table reference
     */
    public SmsTemplate(String alias) {
        this(DSL.name(alias), SMS_TEMPLATE);
    }

    /**
     * Create an aliased <code>notify.sms_template</code> table reference
     */
    public SmsTemplate(Name alias) {
        this(alias, SMS_TEMPLATE);
    }

    /**
     * Create a <code>notify.sms_template</code> table reference
     */
    public SmsTemplate() {
        this(DSL.name("sms_template"), null);
    }

    public <O extends Record> SmsTemplate(Table<O> child, ForeignKey<O, SmsTemplateRecord> key) {
        super(child, key, SMS_TEMPLATE);
    }

    @Override
    public Schema getSchema() {
        return Notify.NOTIFY;
    }

    @Override
    public Identity<SmsTemplateRecord, Long> getIdentity() {
        return (Identity<SmsTemplateRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<SmsTemplateRecord> getPrimaryKey() {
        return Keys.KEY_SMS_TEMPLATE_PRIMARY;
    }

    @Override
    public List<UniqueKey<SmsTemplateRecord>> getKeys() {
        return Arrays.<UniqueKey<SmsTemplateRecord>>asList(Keys.KEY_SMS_TEMPLATE_PRIMARY, Keys.KEY_SMS_TEMPLATE_TEMPLATE_CODE);
    }

    @Override
    public SmsTemplate as(String alias) {
        return new SmsTemplate(DSL.name(alias), this);
    }

    @Override
    public SmsTemplate as(Name alias) {
        return new SmsTemplate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SmsTemplate rename(String name) {
        return new SmsTemplate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SmsTemplate rename(Name name) {
        return new SmsTemplate(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}

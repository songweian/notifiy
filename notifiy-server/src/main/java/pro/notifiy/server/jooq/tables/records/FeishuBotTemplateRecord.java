/*
 * This file is generated by jOOQ.
 */
package pro.notifiy.server.jooq.tables.records;


import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import pro.notifiy.server.jooq.tables.FeishuBotTemplate;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FeishuBotTemplateRecord extends UpdatableRecordImpl<FeishuBotTemplateRecord> implements Record9<Long, String, String, String, String, String, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>notify.feishu_bot_template.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>notify.feishu_bot_template.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>notify.feishu_bot_template.app_id</code>.
     */
    public void setAppId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>notify.feishu_bot_template.app_id</code>.
     */
    public String getAppId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>notify.feishu_bot_template.template_code</code>.
     */
    public void setTemplateCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>notify.feishu_bot_template.template_code</code>.
     */
    public String getTemplateCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>notify.feishu_bot_template.template_content</code>.
     */
    public void setTemplateContent(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>notify.feishu_bot_template.template_content</code>.
     */
    public String getTemplateContent() {
        return (String) get(3);
    }

    /**
     * Setter for <code>notify.feishu_bot_template.default_params</code>.
     */
    public void setDefaultParams(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>notify.feishu_bot_template.default_params</code>.
     */
    public String getDefaultParams() {
        return (String) get(4);
    }

    /**
     * Setter for <code>notify.feishu_bot_template.ext_params</code>.
     */
    public void setExtParams(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>notify.feishu_bot_template.ext_params</code>.
     */
    public String getExtParams() {
        return (String) get(5);
    }

    /**
     * Setter for <code>notify.feishu_bot_template.state</code>.
     */
    public void setState(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>notify.feishu_bot_template.state</code>.
     */
    public String getState() {
        return (String) get(6);
    }

    /**
     * Setter for <code>notify.feishu_bot_template.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>notify.feishu_bot_template.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>notify.feishu_bot_template.update_time</code>.
     */
    public void setUpdateTime(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>notify.feishu_bot_template.update_time</code>.
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, String, String, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, String, String, String, String, String, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return FeishuBotTemplate.FEISHU_BOT_TEMPLATE.ID;
    }

    @Override
    public Field<String> field2() {
        return FeishuBotTemplate.FEISHU_BOT_TEMPLATE.APP_ID;
    }

    @Override
    public Field<String> field3() {
        return FeishuBotTemplate.FEISHU_BOT_TEMPLATE.TEMPLATE_CODE;
    }

    @Override
    public Field<String> field4() {
        return FeishuBotTemplate.FEISHU_BOT_TEMPLATE.TEMPLATE_CONTENT;
    }

    @Override
    public Field<String> field5() {
        return FeishuBotTemplate.FEISHU_BOT_TEMPLATE.DEFAULT_PARAMS;
    }

    @Override
    public Field<String> field6() {
        return FeishuBotTemplate.FEISHU_BOT_TEMPLATE.EXT_PARAMS;
    }

    @Override
    public Field<String> field7() {
        return FeishuBotTemplate.FEISHU_BOT_TEMPLATE.STATE;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return FeishuBotTemplate.FEISHU_BOT_TEMPLATE.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return FeishuBotTemplate.FEISHU_BOT_TEMPLATE.UPDATE_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getAppId();
    }

    @Override
    public String component3() {
        return getTemplateCode();
    }

    @Override
    public String component4() {
        return getTemplateContent();
    }

    @Override
    public String component5() {
        return getDefaultParams();
    }

    @Override
    public String component6() {
        return getExtParams();
    }

    @Override
    public String component7() {
        return getState();
    }

    @Override
    public LocalDateTime component8() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component9() {
        return getUpdateTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getAppId();
    }

    @Override
    public String value3() {
        return getTemplateCode();
    }

    @Override
    public String value4() {
        return getTemplateContent();
    }

    @Override
    public String value5() {
        return getDefaultParams();
    }

    @Override
    public String value6() {
        return getExtParams();
    }

    @Override
    public String value7() {
        return getState();
    }

    @Override
    public LocalDateTime value8() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value9() {
        return getUpdateTime();
    }

    @Override
    public FeishuBotTemplateRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public FeishuBotTemplateRecord value2(String value) {
        setAppId(value);
        return this;
    }

    @Override
    public FeishuBotTemplateRecord value3(String value) {
        setTemplateCode(value);
        return this;
    }

    @Override
    public FeishuBotTemplateRecord value4(String value) {
        setTemplateContent(value);
        return this;
    }

    @Override
    public FeishuBotTemplateRecord value5(String value) {
        setDefaultParams(value);
        return this;
    }

    @Override
    public FeishuBotTemplateRecord value6(String value) {
        setExtParams(value);
        return this;
    }

    @Override
    public FeishuBotTemplateRecord value7(String value) {
        setState(value);
        return this;
    }

    @Override
    public FeishuBotTemplateRecord value8(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public FeishuBotTemplateRecord value9(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    @Override
    public FeishuBotTemplateRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, LocalDateTime value8, LocalDateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FeishuBotTemplateRecord
     */
    public FeishuBotTemplateRecord() {
        super(FeishuBotTemplate.FEISHU_BOT_TEMPLATE);
    }

    /**
     * Create a detached, initialised FeishuBotTemplateRecord
     */
    public FeishuBotTemplateRecord(Long id, String appId, String templateCode, String templateContent, String defaultParams, String extParams, String state, LocalDateTime createTime, LocalDateTime updateTime) {
        super(FeishuBotTemplate.FEISHU_BOT_TEMPLATE);

        setId(id);
        setAppId(appId);
        setTemplateCode(templateCode);
        setTemplateContent(templateContent);
        setDefaultParams(defaultParams);
        setExtParams(extParams);
        setState(state);
        setCreateTime(createTime);
        setUpdateTime(updateTime);
    }
}

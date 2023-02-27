/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.shiny.common.service.facade.result;

import java.io.Serializable;

/**
 * @author wuxianxin
 * @version BaseApiResult.java, v 0.1 2023年02月26日 Administrator Exp $
 */
public class BaseApiResult extends BaseResult implements Serializable {

    private static final long serialVersionUID = -125195736458845016L;
    /**
     * 是否需要重试
     */
    private  boolean needRetry;

    /**
     * Getter method for property <tt>needRetry</tt>.
     *
     * @return property value of needRetry
     */
    public boolean isNeedRetry() {
        return needRetry;
    }

    /**
     * Setter method for property <tt>needRetry</tt>.
     *
     * @param needRetry value to be assigned to property needRetry
     */
    public void setNeedRetry(boolean needRetry) {
        this.needRetry = needRetry;
    }
}
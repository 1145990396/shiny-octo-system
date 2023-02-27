/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.shiny.common.service.facade.result;

import java.io.Serializable;

/**
 * @author wuxianxin
 * @version BaseResult.java, v 0.1 2023年02月26日 Administrator Exp $
 */
public class BaseResult implements Serializable {

    private static final long serialVersionUID = -8614262005158013244L;

    /**
     * 业务是否处理成功
     */
    protected boolean success;

    /**
     * Getter method for property <tt>success</tt>.
     *
     * @return property value of success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Setter method for property <tt>success</tt>.
     *
     * @param success value to be assigned to property success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }
}
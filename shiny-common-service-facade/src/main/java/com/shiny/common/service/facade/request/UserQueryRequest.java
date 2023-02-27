/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.shiny.common.service.facade.request;

import java.io.Serializable;

/**
 * @author wuxianxin
 * @version UserQueryRequest.java, v 0.1 2023年02月26日 Administrator Exp $
 */
public class UserQueryRequest implements Serializable {

    private static final long serialVersionUID = 6032162504278842530L;
    private String userId;

    /**
     * Getter method for property <tt>userId</tt>.
     *
     * @return property value of userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Setter method for property <tt>userId</tt>.
     *
     * @param userId value to be assigned to property userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.shiny.common.service.facade.api.User.impl;

import com.shiny.common.service.facade.api.User.UserServiceFacade;
import com.shiny.common.service.facade.request.UserQueryRequest;
import com.shiny.common.service.facade.result.UserQueryResult;

/**
 * @author wuxianxin
 * @version UserServiceImpl.java, v 0.1 2023年02月26日 Administrator Exp $
 */
public class UserServiceFacadeImpl implements UserServiceFacade {

    private String listApiUrl;

    private String detailApiUrl;

    @Override
    public UserQueryResult query(UserQueryRequest request) {
        return new UserQueryResult(listApiUrl + detailApiUrl);
    }

    /**
     * Setter method for property <tt>listApiUrl</tt>.
     *
     * @param listApiUrl value to be assigned to property listApiUrl
     */
    public void setListApiUrl(String listApiUrl) {
        this.listApiUrl = listApiUrl;
    }

    /**
     * Setter method for property <tt>detailApiUrl</tt>.
     *
     * @param detailApiUrl value to be assigned to property detailApiUrl
     */
    public void setDetailApiUrl(String detailApiUrl) {
        this.detailApiUrl = detailApiUrl;
    }
}
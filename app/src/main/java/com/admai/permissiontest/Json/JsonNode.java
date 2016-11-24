/*
 * Copyright (C) 2012-2013 AdCocoa All Rights Reserved (http://www.adcocoa.com)
 */

package com.admai.permissiontest.Json;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JsonNode {

    String key();

    String description() default "";
}
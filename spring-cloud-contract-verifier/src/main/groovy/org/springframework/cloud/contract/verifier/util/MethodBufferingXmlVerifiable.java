package org.springframework.cloud.contract.verifier.util;

import com.toomuchcoding.xmlassert.XmlVerifiable;

public interface MethodBufferingXmlVerifiable
        extends XmlVerifiable, MethodBuffering {

    @Override
    MethodBufferingXmlVerifiable node(String var1);

    @Override
    MethodBufferingXmlVerifiable withAttribute(String var1, String var2);

    @Override
    MethodBufferingXmlVerifiable node(String... var1);

    @Override
    MethodBufferingXmlVerifiable isEqualTo(String var1) throws IllegalStateException;

    @Override
    MethodBufferingXmlVerifiable isEqualTo(Object var1) throws IllegalStateException;

    @Override
    MethodBufferingXmlVerifiable isEqualTo(Number var1) throws IllegalStateException;

    @Override
    MethodBufferingXmlVerifiable isNull() throws IllegalStateException;

    @Override
    MethodBufferingXmlVerifiable matches(String var1) throws IllegalStateException;

    @Override
    MethodBufferingXmlVerifiable isEqualTo(Boolean var1) throws IllegalStateException;

    @Override
    MethodBufferingXmlVerifiable withoutThrowingException();

    boolean assertsConcreteValue();
}

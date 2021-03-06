package org.micro.tcc.common.support;

/**
 *@author jeff.liu
 *   描述 bean 工厂接口
 * date 2019/7/31
 */
public interface BeanFactory {
    <T> T getBean(Class<T> val);

    <T> boolean isFactoryBean(Class<T> clazz);
}

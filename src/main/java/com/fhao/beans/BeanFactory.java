package com.fhao.beans;

/**
 * author: FHao
 * create time: 2023-04-25 15:40
 * description: bean顶层接口
 */
public interface BeanFactory {
    /**
     * <p>通过bean名称获取bean实例</p>
     */
    Object getBean(String beanName);
}

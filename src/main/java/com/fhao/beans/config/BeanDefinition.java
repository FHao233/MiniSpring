package com.fhao.beans.config;

/**
 * author: FHao
 * create time: 2023-04-25 15:42
 * description: bean 定义
 */
public class BeanDefinition {
    /**
     * <p>bean对应的全类名</p>
     */
    private String beanClassName;
    /**
     * <p>是否懒加载</p>
     */
    private boolean lazyInit = false;

    /**
     * <p>保存在IOC容器时的key值</p>
     */
    private String factoryBeanName;

    public String getBeanClassName() {
        return beanClassName;
    }

    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;
    }

    public boolean isLazyInit() {
        return lazyInit;
    }

    public void setLazyInit(boolean lazyInit) {
        this.lazyInit = lazyInit;
    }

    public String getFactoryBeanName() {
        return factoryBeanName;
    }

    public void setFactoryBeanName(String factoryBeanName) {
        this.factoryBeanName = factoryBeanName;
    }
}

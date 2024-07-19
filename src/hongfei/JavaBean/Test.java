package hongfei.JavaBean;

import java.beans.*;


public class Test {
    public static void main(String[] args) throws Exception {
        BeanInfo bean = Introspector.getBeanInfo(Person.class);//获取BeanInfo对象

        bean.getBeanDescriptor(); //获取Bean描述符
        bean.getEventSetDescriptors(); //获取事件描述符
        bean.getMethodDescriptors(); //获取方法描述符

        for(PropertyDescriptor pd: bean.getPropertyDescriptors()){ //获取属性描述符
            System.out.println("\n");
            System.out.println(pd.getName());//属性名
            System.out.println(pd.getPropertyType());//属性类型
            System.out.println(pd.getReadMethod());//读方法
            System.out.println(pd.getWriteMethod());//写方法
        }
    }
}
